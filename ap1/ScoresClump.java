package ap1;

public class ScoresClump {
	public static boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length - 2; i++) {
			if (Math.abs(scores[i] - scores[i + 2]) > 2)
				continue;
			else
				return true;
		}
		return false;
	}
}
