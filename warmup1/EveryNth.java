package warmup1;

public class EveryNth {
	public String everyNth(String str, int n) {
		int len = str.length() - 1;
		int times = len / n;

		if (len < 2) {
			return str;
		} else {
			String s = "" + str.charAt(0);
			for (int i = 1; i <= times; i++) {
				s += str.charAt(i * n);
			}
			return s;
		}
	}
}
