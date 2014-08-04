package ap1;

public class BigHeights {
	public static int bigHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end - 1; i++) {
			if (Math.abs(heights[i + 1] - heights[i]) >= 5)
				sum++;
		}
		return sum;
	}

}
