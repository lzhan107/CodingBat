package recursion1;

public class NoX {
	public String noX(String str) {
		if (!str.contains("x"))
			return str;
		return noX(str.replaceAll("x", ""));
	}

}
