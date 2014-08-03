package string2;

public class MixString {
	public String mixString(String a, String b) {
		int min = Math.min(a.length(), b.length());
		int max = Math.max(a.length(), b.length());
		String s = "";

		for (int i = 0; i < min; i++) {
			s += "" + a.charAt(i) + b.charAt(i);
		}

		if (a.length() > b.length())
			return s + a.substring(min, max);

		return s + b.substring(min, max);
	}
}
