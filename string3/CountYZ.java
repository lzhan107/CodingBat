package string3;

public class CountYZ {
	
	public static int countYZ(String str){
		
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (!Character.isLetter(str.charAt(i)) && i > 0){
				if (str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'Y' || str.charAt(i - 1) == 'Z'){
					count++;
				}
			}
		}
		
		if ("y".equalsIgnoreCase(str.substring(str.length() - 1)) || "z".equalsIgnoreCase(str.substring(str.length() - 1)))
			count++;
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countYZ("fez day"));
		System.out.println(countYZ("day fez"));
		System.out.println(countYZ("day fyyyz"));
	}
}
