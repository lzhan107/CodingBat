package string2;

public class PlusOut {
	public String plusOut(String str, String word) {

		int wordLen = word.length();
		String result = "";
		for (int i = 0; i < str.length() - wordLen + 1; i++) {
			if (!str.substring(i, i + wordLen).equals(word)) {
				if (i == str.length() - wordLen) {
					for (int j = 0; j < wordLen; j++) {
						result += "+";
					}
				} else {
					result += "+";
				}
			} else {
				result += word;
				i = i + wordLen - 1;
			}
		}

		if (result.length() < str.length()) {
			for (int j = 0; j < str.length() - result.length(); j++) {
				result += "+";
			}
		}
		return result;
	}
}
