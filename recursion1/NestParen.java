package recursion1;

public class NestParen {
	public boolean nestParen(String str) {
		if (str.length() == 0)
			return true;

		if (str.length() == 1)
			return false;

		int first = str.indexOf("(");
		int last = str.lastIndexOf(")");

		if (first == -1 || last == -1)
			return false;

		return nestParen(str.substring(first + 1, last));

	}
}
