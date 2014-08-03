package string2;

public class RepeatFront {
	public String repeatFront(String str, int n) {
		if (n == 0)
			return "";

		String sub = str.substring(0, n);

		String result = "";

		for (int i = sub.length() - 1; i >= 0; i--) {
			result += sub.substring(0, i + 1);
		}

		return result;
	}
}
