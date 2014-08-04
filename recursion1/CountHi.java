package recursion1;

public class CountHi {
	public static int countHi(String str) {
		if (str.length() < 2)
			return 0;

		if (str.contains("hi"))
			return 1 + countHi(str.substring(0, str.indexOf("hi"))
					+ str.substring(str.indexOf("hi") + 2));
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(countHi("xxhixx"));
	}
}
