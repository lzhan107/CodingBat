package logic2;

public class LoneSum {
	public int loneSum(int a, int b, int c) {
		// All there scenarios
		// All are equal
		if (a == b && b == c)
			return 0;
		// All are not equal to each other
		if (a != b && b != c && c != a)
			return a + b + c;
		// two of them are equal
		if (a == b)
			return c;
		if (b == c)
			return a;
		if (a == c)
			return b;

		return 0;
	}
}
