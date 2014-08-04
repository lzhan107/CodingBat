package ap1;

public class ScoresAverage {
	public static int scoresAverage(int[] scores) {
		int firstAvg = average(scores, 0, scores.length / 2 - 1);
		int secondAvg = average(scores, scores.length / 2, scores.length - 1);
		return firstAvg > secondAvg ? firstAvg : secondAvg;
	}

	public static int average(int[] scores, int start, int end) {
		int sum = 0;

		for (int i = start; i <= end; i++) {
			sum += scores[i];
		}

		return sum / (end - start + 1);
	}
}
