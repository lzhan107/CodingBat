package warmup2;

public class StringTimes {
	public String stringTimes(String str, int n) {
		String s = str;
		if (n == 0) {
			return "";
		} else {
			for (int i = 0; i < n - 1; i++) {
				s += str;
			}
		}
		return s;
	}
}
