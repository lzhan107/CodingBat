package string2;

public class XyzMiddle {
	public boolean xyzMiddle(String str) {
		if (str.length() < 3)
			return false;
		if (str.equals("xyz"))
			return true;

		int len = str.length() - 2;
		// The index of "xyz" unit ,should be len/2 - 1 to len/2

		// If "xyz" is a unit, if the total number of elements is odd,so we
		// can pad one element on either left or right side, so the result will
		// be //even.
		// If the number is even, we can only pad one element on the side with
		// less
		// element, so the result is odd.
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y'
					&& str.charAt(i + 2) == 'z') {
				if (len % 2 == 0 && i >= len / 2 - 1 && i <= len / 2) {
					return true;
				} else if (i == len / 2) {
					return true;
				}
			}
		}

		return false;
	}
}
