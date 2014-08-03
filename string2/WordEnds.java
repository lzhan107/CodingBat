package string2;

public class WordEnds {
	public String wordEnds(String str, String word) {

		if (str.equals(word))
			return "";

		int wordLen = word.length();
		String result = "";
		for (int i = 0; i < str.length() - wordLen + 1; i++) {
			if (str.substring(i, i + wordLen).equals(word)) {
				if (i == 0) {
					result += str.charAt(i + wordLen);
				} else if (i == str.length() - wordLen) {
					result += str.charAt(i - 1);
				} else {
					result += str.charAt(i - 1);
					result += str.charAt(i + wordLen);
				}
			}
		}

		return result;
	}
}
