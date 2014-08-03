package string2;

public class RepeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		if (count == 0)
			return "";

		if (count < 2)
			return word;

		String result = "";
		for (int i = 0; i < count; i++) {
			result += word;
			if (i != count - 1)
				result += sep;
		}

		return result;
	}
}
