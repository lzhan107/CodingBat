package string1;

public class EndsLy {
	public boolean endsLy(String str) {
		if (str.length() < 2)
			return false;

		String tail = str.substring(str.length() - 2, str.length());

		if (tail.equals("ly"))
			return true;

		return false;
	}
}
