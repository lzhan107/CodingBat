package array2;

public class FizzArray3 {
	public static int[] fizzArray3(int start, int end){
		int[] a = new int[end - start];
		
		for (int i = 0; i < end-start; i++){
			a[i] = start+i;
		}
		
		return a;
	}
}
