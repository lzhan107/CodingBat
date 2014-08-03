package warmup2;

public class DoubleX {
	boolean doubleX(String str) {

		if (str.length() < 2) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x' && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'x'
						&& !str.substring(0, i).contains("x")) {
					return true;
				}
			}
		}

		return false;
	}
}
