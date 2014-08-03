package logic2;

public class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		int sum = a + b + c;
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		int mid = sum - max - min;

		if ((max - mid) == (mid - min))
			return true;
		return false;
	}
}
