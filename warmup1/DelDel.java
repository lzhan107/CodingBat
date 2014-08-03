package warmup1;

public class DelDel {
	public String delDel(String str) {
		if (str.length() < 4) {
			return str;
		} else if (str.charAt(1) == 'd' && str.charAt(2) == 'e'
				&& str.charAt(3) == 'l') {
			return str.charAt(0) + str.substring(4, str.length());
		} else {
			return str;
		}
	}
}
