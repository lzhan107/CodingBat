package string1;

public class Concat {
	public String conCat(String a, String b) {
		if (a.length() < 1 || b.length() < 1)
			return a + b;

		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			return a.substring(0, a.length() - 1) + b;
		} else {
			return a + b;
		}
	}
}
