package array1;

public class Front11 {
	public int[] front11(int[] a, int[] b) {
		int[] temp = new int[2];
		if (a.length > 0) {
			temp[0] = a[0];
			if (b.length > 0) {
				temp[1] = b[0];
			}
		} else {
			if (b.length > 0) {
				temp[0] = b[0];
			}
		}

		int len = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0)
				len++;
		}

		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = temp[i];
		}

		return result;
	}
}
