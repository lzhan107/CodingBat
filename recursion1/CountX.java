package recursion1;

public class CountX {
	public int countX(String str) {
		if (str.length() == 0)
			return 0;
		if (str.length() == 1)
			return str.charAt(0) == 'x' ? 1 : 0;
		if (str.charAt(str.length() - 1) == 'x')
			return 1 + countX(str.substring(0, str.length() - 1));
		return countX(str.substring(0, str.length() - 1));
	}
}
