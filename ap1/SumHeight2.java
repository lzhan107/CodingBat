package ap1;

public class SumHeight2 {
	public static int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end - 1; i++) {
			if (heights[i + 1] > heights[i])
				sum += 2 * Math.abs(heights[i + 1] - heights[i]);
			else
				sum += Math.abs(heights[i + 1] - heights[i]);
		}
		return sum;
	}
}
