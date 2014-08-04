package recursion1;

public class StrCount {
	public int strCount(String str, String sub) {
		if (str.length() < sub.length())
			return 0;

		if (str.contains(sub))
			return 1 + strCount(str.substring(str.indexOf(sub) + sub.length()),
					sub);
		return 0;
	}
}
