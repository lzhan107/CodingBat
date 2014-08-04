package recursion1;

public class CountAbc {
	public static int countAbc(String str) {
		if (str.length() < 3)
			return 0;

		if (str.contains("aba"))
			return 1 + countAbc(str.substring(str.indexOf("aba") + 2));
		if (str.contains("abc"))
			return 1 + countAbc(str.substring(str.indexOf("abc") + 3));

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(countAbc("ababc"));
	}
}
