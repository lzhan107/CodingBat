package ap1;

public class WordsWithout {
	public static String[] wordsWithout(String[] words, String target) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (target.equals(words[i]))
				count++;
		}

		String[] s = new String[words.length - count];
		int idx = 0;
		for (int i = 0; i < words.length - count; i++) {
			for (int j = idx; j < words.length; j++) {
				if (!target.equals(words[j])) {
					s[i] = words[j];
					idx = j + 1;
					break;
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String[] s = {"a", "b", "c", "a"};
		String[] ss = wordsWithout(s, "b");
		for (int i = 0; i < ss.length; i++){
			System.out.println(ss[i]);
		}
	}
}
