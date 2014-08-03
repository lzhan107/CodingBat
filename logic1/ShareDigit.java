package logic1;

public class ShareDigit {
	public boolean shareDigit(int a, int b) {
		int x = a / 10;
		int xx = a % 10;
		int y = b / 10;
		int yy = b % 10;

		if (x == y || x == yy || xx == y || xx == yy)
			return true;

		return false;
	}
}
