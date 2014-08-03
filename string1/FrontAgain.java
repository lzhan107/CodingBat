package string1;

public class FrontAgain {
	public boolean frontAgain(String str) {
		if (str.length() < 2)
			return false;

		String firstTwo = str.substring(0, 2);
		String lastTwo = str.substring(str.length() - 2, str.length());

		return firstTwo.equals(lastTwo);
	}
}
