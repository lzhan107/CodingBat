package string1;

public class DeFront {
	public String deFront(String str) {
		if (str.length() < 1) {
			return "";
		} else if (str.length() == 1) {
			if (str.equals("a"))
				return "";
			else
				return str;
		} else {
			if (str.charAt(0) == 'a') {
				if (str.charAt(1) == 'b') {
					return str;
				} else {
					return "" + 'a' + str.substring(2, str.length());
				}
			} else {
				str = str.substring(1, str.length());
				if (str.charAt(0) == 'b') {
					return str;
				} else {
					return str.substring(1, str.length());
				}
			}
		}
	}
}
