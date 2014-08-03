package string1;

public class AtFirst {
	public String atFirst(String str) {
		if (str.length() < 1) {
			return "@@";
		} else if (str.length() < 2) {
			return str + "@";
		} else {
			return str.substring(0, 2);
		}
	}
}
