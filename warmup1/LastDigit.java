package warmup1;

public class LastDigit {
	public boolean lastDigit(int a, int b) {
		int aRemainder = a % 10;
		int bRemainder = b % 10;
		return aRemainder == bRemainder;
	}
}
