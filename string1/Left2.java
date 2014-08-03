package string1;

public class Left2 {
	public String left2(String str) {
		if (str.length() < 3)
			return str;

		String firstTwo = str.substring(0, 2);
		String remaining = str.substring(2, str.length());

		return remaining + firstTwo;
	}
}
