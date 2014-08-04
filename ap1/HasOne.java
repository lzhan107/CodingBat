package ap1;

public class HasOne {
	public static boolean hasOne(int n) {
		while (n > 0) {
			int digit = n % 10;
			if (digit == 1)
				return true;
			n = n / 10;
		}
		return false;
	}
}
