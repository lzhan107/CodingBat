package string1;

public class HasBad {
	public boolean hasBad(String str) {
		if (str.length() < 3)
			return false;

		if (str.length() == 3) {
			if (str.equals("bad")) {
				return true;
			} else {
				return false;
			}
		} else {
			if (str.substring(0, 3).equals("bad")
					|| str.substring(1, 4).equals("bad")) {
				return true;
			} else {
				return false;
			}
		}
	}
}
