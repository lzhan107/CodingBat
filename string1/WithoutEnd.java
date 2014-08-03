package string1;

public class WithoutEnd {
	public String withoutEnd(String str) {
		if (str.length() < 3)
			return "";

		return str.substring(1, str.length() - 1);
	}
}
