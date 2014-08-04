package recursion1;

public class StrCopies {
	public static boolean strCopies(String str, String sub, int n) {
		if (str.length() < sub.length())
			if (n > 0)
				return false;
			else
				return true;

		if (str.contains(sub))
			return strCopies(
					str.substring(0, str.indexOf(sub))
							+ str.substring(str.indexOf(sub) + 1), sub, n - 1);
		return n == 0;
	}

	public static void main(String[] args) {
		System.out.println(strCopies("catcowcat", "cow", 1));
	}
}
