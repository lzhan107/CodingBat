package string3;

public class WithoutString {
	public static String withoutString(String base, String remove){
		String result = "";
		int wordLen = remove.length();
		
		for (int i = 0; i < base.length() - wordLen + 1; i++){
			if (!base.substring(i, i+wordLen).equalsIgnoreCase(remove)){
				result += base.charAt(i);
			}else{
				i = i + wordLen - 1;
			}
			if (i == base.length() - wordLen){
				result += base.substring(i+1);
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(withoutString("Hello there", "llo"));
		System.out.println(withoutString("Hello there", "e"));
		System.out.println(withoutString("Hello there", "x"));
	}
}
