package logic2;

public class RoundSum {
	public int roundSum(int a, int b, int c) {
		int rA = round10(a);
		int rB = round10(b);
		int rC = round10(c);

		return rA + rB + rC;
	}

	public int round10(int num) {
		if (num % 10 >= 5)
			return (num / 10 + 1) * 10;

		return num / 10 * 10;
	}
}
