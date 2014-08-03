package string1;

public class ExtraEnd {
	public String extraEnd(String str) {
		if (str.length() < 2)
			return str;

		String tail = "";

		for (int i = str.length() - 2; i <= str.length() - 1; i++) {
			tail += str.charAt(i);
		}

		return tail + tail + tail;
	}

}
