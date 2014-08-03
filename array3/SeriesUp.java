package array3;

public class SeriesUp {
	public static int[] seriesUp(int n){
		int[] result = new int[n*(n+1)/2];
		int startIdx = 0;
		for (int i = 0; i < n; i++){
			for (int j = 0; j <= i;j++){
				result[startIdx+j] = j+1;
			}
			startIdx += i + 1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] b = seriesUp(4);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
