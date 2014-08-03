package logic1;

public class SumLimit {
	public int sumLimit(int a, int b) {
		int digitNumOfa = String.valueOf(a).length();
		int digitNumofSum = String.valueOf(a + b).length();

		if (digitNumOfa == digitNumofSum)
			return a + b;
		return a;
	}
}
