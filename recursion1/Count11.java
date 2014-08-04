package recursion1;

public class Count11 {
	public int count11(String str) {
		if (str.length() < 2)
			return 0;
		if (str.contains("11"))
			return 1 + count11(str.substring(str.indexOf("11") + 2));
		return 0;
	}
}
