package string3;

public class Ghappy {
	public static boolean gHappy(String str) {
		
		if (str.length() < 1)
			return true;

		boolean match = false;
		for (int i = 0; i < str.length() - 1;i++){
			if (str.charAt(i) == 'g'){
				if (str.charAt(i + 1) != 'g'){
					match = false;
					return false;
				}
				match = true;
				i = i + 2;
			}
		}
		
		
		if (match)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(gHappy("xxggxx"));
		System.out.println(gHappy("xxgxx"));
		System.out.println(gHappy("xxggyygxx"));
		System.out.println(gHappy("xxgggxyg"));
	}
	
	
	public static boolean anotherGHappy(String str){
		if (str.length() < 1)
			return true;
		
		if (str.length() < 2 && str.charAt(0) == 'g')
			return true;
		
		for (int i = 0; i < str.length(); i++){
			if (i == 0){
				if (str.charAt(i) == 'g' && str.charAt(i + 1) == 'g')
					continue;
			}else if (i == str.length() - 1){
				if (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g')
					continue;
			}else{
				if (str.charAt(i) == 'g' && (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g')){
					continue;
				}
			}
			
			return false;
		}
		
		return true;
	}
}
