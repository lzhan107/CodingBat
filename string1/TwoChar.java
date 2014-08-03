package string1;

public class TwoChar {
	public String twoChar(String str, int index) {
		int len = str.length();

		if (index + 2 > len || index < 0) {
			return str.substring(0, 2);
		} else {
			return str.substring(index, index + 2);
		}
	}
}
