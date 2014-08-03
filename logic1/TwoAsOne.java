package logic1;

public class TwoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		// If there is negative value, then we use mid value once sorted
		// Otherwise, if they are positive, then we use largest value
		int val = 0;
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		int sum = a + b + c;
		int mid = sum - max - min;

		if (a < 0 || b < 0 || c < 0) {
			val = mid;
		} else {
			val = max;
		}

		if (sum == 2 * val)
			return true;
		return false;
	}
}
