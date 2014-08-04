package recursion1;

public class StrDist {
	public static int strDist(String str, String sub) {
		if (str.length() < sub.length() || str.indexOf(sub) == -1)
			return 0;

		if (str.indexOf(sub) != 0)
			return strDist(str.substring(str.indexOf(sub)), sub);
		else if (str.lastIndexOf(sub) != str.length() - sub.length())
			return strDist(
					str.substring(0, str.lastIndexOf(sub) + sub.length()), sub);
		return str.length();
	}

	public static void main(String[] args) {
		System.out.println(strDist("catcowcat", "cow"));
	}
}
