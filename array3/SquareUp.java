package array3;

public class SquareUp {
	public static int[] squareUp(int n){
		int s = n * n;
		int[] result = new int[s];
		for (int i = 0; i < n; i++){
			for (int j = n-1; j >= 0 ; j--){
				if (i - j >= 0){
					result[(n-1-j) + i*n] = j + 1;
				}else{
					result[(n-1-j) + i*n] = 0;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] b = squareUp(4);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
