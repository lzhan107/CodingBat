package warmup2;

public class StringBits {
	public String stringBits(String str) {
		String s = "";
		if (str.length() < 1) {
			return "";
		} else if (str.length() < 3) {
			return "" + str.charAt(0);
		} else {
			for (int i = 0; i < str.length(); i += 2) {
				s += "" + str.charAt(i);
			}
		}
		return s;
	}
}
