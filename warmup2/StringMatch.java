package warmup2;

public class StringMatch {
	public int stringMatch(String a, String b) {
		int count = 0;
		// for (int i = 0; i < a.length() -1; i++){
		// String aSub = a.substring(i, i+2);
		// for (int j = 0; j < b.length() -1; j++){
		// String bSub = b.substring(j, j+2);
		// if (aSub.equals(bSub))
		// count++;
		// }
		// }

		int len = Math.min(a.length(), b.length());
		for (int i = 0; i < len - 1; i++) {
			String aSub = a.substring(i, i + 2);
			String bSub = b.substring(i, i + 2);
			if (aSub.equals(bSub))
				count++;
		}

		return count;
	}
}
