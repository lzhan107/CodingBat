package ap1;

public class DividesSelf {
	public static boolean dividesSelf(int n) {
		int original = n;
		while (n > 0) {
			int digit = n % 10;
			if (digit == 0 || (original % digit != 0))
				return false;
			n = n / 10;
		}
		return true;
	}

}
