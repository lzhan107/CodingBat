package warmup1;

public class StartOz {
	public String startOz(String str) {
		if (str.length() < 2) {
			return str;
		} else if (str.charAt(0) == 'o') {
			return str.charAt(1) == 'z' ? "oz" : "o";
		} else if (str.charAt(1) == 'z') {
			return "z";
		} else {
			return "";
		}
	}
}
