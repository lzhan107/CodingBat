package logic1;

public class LastDigit {
	public boolean lastDigit(int a, int b, int c) {
		int digitA = a % 10;
		int digitB = b % 10;
		int digitC = c % 10;

		if (digitA == digitB || digitB == digitC || digitA == digitC)
			return true;
		return false;
	}
}
