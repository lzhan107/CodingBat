package array2;

public class FizzArray2 {
	public static String[] fizzArray2(int n){
		String[] s = new String[n];
		for (int i = 0; i < n; i++){
			s[i] = String.valueOf(i);
		}
		return s;
	}
}
