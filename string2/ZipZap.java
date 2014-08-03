package string2;

public class ZipZap {
	public String zipZap(String str) {
		int len = str.length() - 2;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				str = str.substring(0, i + 1)
						+ str.substring(i + 2, str.length());
				len = str.length();
			}
		}
		return str;
	}
}
