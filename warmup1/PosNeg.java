package warmup1;

public class PosNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		return (negative == true ? (a < 0 && b < 0) : (a * b < 0));
	}
}
