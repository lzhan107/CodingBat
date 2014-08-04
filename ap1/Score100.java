package ap1;

public class Score100 {
	public static boolean score100(int[] scores){
		for (int i = 0; i < scores.length-1; i++){
			if (scores[i] == 100 && scores[i+1]==100)
				return true;
		}
		return false;
	}
}
