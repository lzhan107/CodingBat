package string2;

public class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		int len = str.length() / 2;
		if (n > len)
			return false;

		String pre = str.substring(0, n);// a

		for (int i = len; i < str.length() - n + 1; i++) {
			if (pre.equals(str.substring(i, i + n))) {
				return true;
			}
		}

		return false;
	}
}
