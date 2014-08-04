package recursion1;

public class AllStar {
	public String allStar(String str) {
		if (str.length() < 2 || str.charAt(str.length() - 2) == '*')
			return str;
		int startIdx = str.lastIndexOf("*");
		if (startIdx == -1)
			return allStar(str.substring(0, 1) + "*" + str.substring(1));
		else
			return allStar(str.substring(0, startIdx + 2) + "*"
					+ str.substring(startIdx + 2));
	}

	public static void main(String[] args) {
		System.out.println("hello".lastIndexOf("*"));
	}
}
