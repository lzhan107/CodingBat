package ap1;

public class CommonTwo {
	public static int commonTwo(String[] a, String[] b) {
		int count = 0;
		int idxA = 0;
		int idxB = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			boolean hasA = false;
			boolean hasB = false;
			for (int j = idxA; j < a.length; j++) {
				if ((i + "").equals(a[j])) {
					hasA = true;
					idxA = j + 1;
					break;
				}
			}

			for (int k = idxB; k < b.length; k++) {
				if ((i + "").equals(b[k])) {
					hasB = true;
					idxB = k + 1;
					break;
				}
			}

			if (hasA && hasB)
				count++;
			hasA = false;
			hasB = false;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String[] a = {"a", "b", "c"};
		String[] b = {"a", "b", "c"};
		System.out.println(commonTwo(a, b));
	}
}
