package warmup2;

public class AltPairs {
	public String altPairs(String str) {
		if (str.length() < 2)
			return str;

		String s = "";
		for (int i = 0; i < str.length(); i = i + 4) {
			if (i + 1 < str.length()) {
				s = s + str.charAt(i) + str.charAt(i + 1);
			} else if (i < str.length()) {
				s = s + str.charAt(i);
			}
		}
		return s;
	}
}
