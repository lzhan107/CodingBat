package string1;

public class StartWord {
	public String startWord(String str, String word) {
		if (str.length() < 1 || str.length() < word.length())
			return "";

		int len = word.length();

		String sub = str.substring(0, len);
		String sub2 = str.substring(1, len);
		String subWord = word.substring(1, len);

		if (sub.equals(word)) {
			return word;
		} else if (sub2.equals(subWord)) {
			return sub;
		} else {
			return "";
		}
	}
}
