package ap1;

public class ScoresSpecial {
	public static int scoresSpecial(int[] a, int[] b) {
		int maxA = largestSpecialScore(a);
		int maxB = largestSpecialScore(b);

		return maxA + maxB;
	}

	public static int largestSpecialScore(int[] arr) {
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 10 == 0 && max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = {12, 10, 4};
		int[] b = {2, 20, 30};
		
		System.out.println(scoresSpecial(a, b));
	}
}
