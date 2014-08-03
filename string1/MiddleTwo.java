package string1;

public class MiddleTwo {
	public String middleTwo(String str) {
		int len = str.length();

		return "" + str.charAt(len / 2 - 1) + str.charAt(len / 2);
	}
}
