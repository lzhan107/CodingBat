package string2;

public class CountHi {
	public int countHi(String str) {
		String sub = "hi";
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (sub.equals(str.substring(i, i + 2)))
				count++;
		}

		return count;
	}
}
