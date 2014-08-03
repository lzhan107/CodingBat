package string1;

public class WithoutX {
	public String withoutX(String str) {
		int len = str.length();
		if (len > 0 && str.charAt(0) == 'x') {
			str = str.substring(1, len);
			len = str.length();
		}

		if (len > 0 && str.charAt(len - 1) == 'x') {
			str = str.substring(0, len - 1);
		}

		return str;
	}
}
