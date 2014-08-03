package string1;

public class Right2 {
	public String right2(String str) {
		if (str.length() < 3)
			return str;

		String lastTwo = str.substring(str.length() - 2, str.length());
		String remaining = str.substring(0, str.length() - 2);

		return lastTwo + remaining;
	}
}
