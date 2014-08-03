package warmup1;

public class Close10 {
	public int close10(int a, int b) {
		int aDistance = Math.abs(a - 10);
		int bDistance = Math.abs(b - 10);
		return aDistance == bDistance ? 0 : (aDistance < bDistance ? a : b);
	}
}
