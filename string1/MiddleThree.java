package string1;

public class MiddleThree {
	public String middleThree(String str) {
		int midIdx = str.length() / 2;

		return "" + str.charAt(midIdx - 1) + str.charAt(midIdx)
				+ str.charAt(midIdx + 1);
	}
}
