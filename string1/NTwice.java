package string1;

public class NTwice {
	public String nTwice(String str, int n) {
		String head = str.substring(0, n);
		String tail = str.substring(str.length() - n, str.length());
		return head + tail;
	}
}
