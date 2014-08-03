package array1;

public class CommandEnd {
	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
	}
}
