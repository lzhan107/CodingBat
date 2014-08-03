package string1;

public class LastTwo {
	public String lastTwo(String str) {
		if (str.length() < 2)
			return str;

		String lastTwo = str.substring(str.length() - 2, str.length());
		String remaining = str.substring(0, str.length() - 2);

		return remaining + lastTwo.charAt(1) + lastTwo.charAt(0);
	}

}
