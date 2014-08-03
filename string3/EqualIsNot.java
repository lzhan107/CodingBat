package string3;

public class EqualIsNot {
	public static boolean equalIsNot(String str){
		int iCount = 0;
		int nCount = 0;
		
		for (int i = 0; i < str.length() - 1; i++){
			if (str.substring(i, i+2).equals("is")){
				iCount++;
			}
		}
		
		for (int i = 0; i < str.length() - 2; i++){
			if (str.substring(i, i+3).equals("not")){
				nCount++;
			}
		}
		
		return iCount == nCount;
	}
	
	public static void main(String[] args) {
		System.out.println(equalIsNot("This is not"));
		System.out.println(equalIsNot("This is notnot"));
		System.out.println(equalIsNot("noisxxnotyynotxisi"));
	}
}
