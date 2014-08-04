package ap1;

public class WordsFront {
	public static String[] wordsFront(String[] words, int n) {
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = words[i];
		}
		return s;
	}
}
