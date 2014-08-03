package string2;

public class XyzThere {
	public boolean xyzThere(String str) {
		String sub = "xyz";

		for (int i = 0; i < str.length() - 2; i++) {
			if (sub.equals(str.substring(i, i + 3))) {
				if (i == 0 || (i > 0 && str.charAt(i - 1) != '.')) {
					return true;
				}
			}
		}

		return false;
	}
}
