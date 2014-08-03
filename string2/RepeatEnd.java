package string2;

public class RepeatEnd {
	public String repeatEnd(String str, int n) {
		if (n == 0)
			return "";

		String sub = "";

		for (int i = 0; i < str.length(); i++) {
			if (i < (str.length() - n))
				continue;
			sub += "" + str.charAt(i);
		}

		String result = "";
		for (int i = 0; i < n; i++) {
			result += sub;
		}

		return result;
	}
}
