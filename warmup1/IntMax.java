package warmup1;

public class IntMax {
	public int intMax(int a, int b, int c) {
		int max = a > b ? a : b;
		return max > c ? max : c;
	}
}
