package string1;

public class MinCat {
	public String minCat(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();

		if (aLen > bLen) {
			return a.substring(a.length() - bLen, a.length()) + b;
		} else if (aLen < bLen) {
			return a + b.substring(b.length() - aLen, b.length());
		} else {
			return a + b;
		}
	}
}
