package string3;

public class NotReplace {
	public static String notReplace(String str){
		str = " " + str + " ";
		String result = "";
		
		for (int i = 1; i < str.length() - 1; i++){
			
			if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's' && !Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))){
				result += "is not";
				i++;
				continue;
			}
			
			result += "" + str.charAt(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(notReplace("is test"));
		System.out.println(notReplace("is-is"));
		System.out.println(notReplace("This is right"));
	}
}
