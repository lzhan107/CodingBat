package logic2;

public class NoTeenSum {
	public int noTeenSum(int a, int b, int c) {
		int tA = fixTeen(a);
		int tB = fixTeen(b);
		int tC = fixTeen(c);

		return tA + tB + tC;
	}

	public int fixTeen(int n) {
		if (n >= 13 && n <= 19 && n != 15 && n != 16)
			return 0;
		return n;
	}
}
