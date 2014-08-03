package string1;

public class LastChars {
	public String lastChars(String a, String b) {
		String tempA = "";
		String tempB = "";

		if (a.length() < 1)
			tempA = "@";
		else
			tempA = "" + a.charAt(0);
		if (b.length() < 1)
			tempB = "@";
		else
			tempB = "" + b.charAt(b.length() - 1);

		return tempA + tempB;
	}
}
