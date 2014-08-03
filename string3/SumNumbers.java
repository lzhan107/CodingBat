package string3;

public class SumNumbers {
	public static int sumNumbers(String str){
		int sum = 0;
		String numStr = "";
		str = str + "a";
		
		for (int i = 0; i < str.length(); i++){
			if (!Character.isDigit(str.charAt(i))){
				if (!numStr.equals(""))
					sum += Integer.parseInt(numStr);
				numStr = "";
				continue;
			}
			
			numStr += "" + str.charAt(i);   
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumNumbers("abc123xyz"));
		System.out.println(sumNumbers("aa11b33"));
		System.out.println(sumNumbers("7 11"));
	}
}
