package recursion1;

public class PairStar {
	public String pairStar(String str) {
		if (str.length() < 2)
			return str;

		boolean hasEqualChars = false;
		int idx = -1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				hasEqualChars = true;
				idx = i;
			}
		}

		if (!hasEqualChars)
			return str;
		else
			return pairStar(str.substring(0, idx + 1) + "*"
					+ str.substring(idx + 1));

	}
}
