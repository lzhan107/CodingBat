package array1;

public class Make2 {
	public int[] make2(int[] a, int[] b) {
		int[] r = new int[2];
		int lenA = a.length;

		for (int i = 0; i < lenA; i++) {
			if (i < 2) {
				r[i] = a[i];
			}
		}

		for (int i = lenA; i < 2; i++) {
			r[i] = b[i - lenA];
		}

		return r;
	}
}
