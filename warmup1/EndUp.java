package warmup1;

public class EndUp {
	public String endUp(String str) {
		int len = str.length();
		if (str.length() < 3) {
			return str.toUpperCase();
		} else {
			return str.substring(0, len - 3)
					+ str.substring(len - 3, len).toUpperCase();
		}
	}
}
