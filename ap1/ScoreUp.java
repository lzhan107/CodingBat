package ap1;

public class ScoreUp {
	public static int scoreUp(String[] key, String[] answers) {
		int correct = 4;
		int incorrect = -1;
		int blank = 0;
		int score = 0;
		for (int i = 0; i < key.length; i++) {
			if (answers[i].equals(key[i])) {
				score += correct;
			} else if ("?".equals(answers[i])) {
				score += blank;
			} else {
				score += incorrect;
			}
		}
		return score;
	}
}
