package array2;

public class FizzArray {
	public static int[] fizzArray(int n){
		int[] a = new int[n];
		for (int i = 0; i < n; i++){
			a[i] = i;
		}
		return a;
	}
}
