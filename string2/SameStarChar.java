package string2;

public class SameStarChar {
	public boolean sameStarChar(String str) {
		if (str.length() < 3)
			return true;

		boolean same = false;
		boolean noStar = true;
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*') {
				noStar = false;
				if (str.charAt(i - 1) == str.charAt(i + 1)) {
					same = true;
					continue;
				}
				same = false;
				break;
			}
		}

		if (noStar)
			same = true;

		return same;
	}
}
