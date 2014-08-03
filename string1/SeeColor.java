package string1;

public class SeeColor {
	public String seeColor(String str) {
		if (str.length() < 3)
			return "";

		if (str.charAt(0) == 'r' && "red".equals(str.substring(0, 3))) {
			return "red";
		} else if (str.length() > 3 && str.charAt(0) == 'b'
				&& "blue".equals(str.substring(0, 4))) {
			return "blue";
		} else {
			return "";
		}
	}
}
