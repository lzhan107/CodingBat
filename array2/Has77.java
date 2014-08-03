package array2;

public class Has77 {
	public static boolean has77(int[] nums) {
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 7) {
				idx1 = i;
				for (int j = i+1; j < nums.length; j++) {
					if (nums[j] == 7) {
						idx2 = j;
						i = j;
						break;
					}
				}
			}
		}
		return idx2 > 0 && (idx2 - idx1) <= 2;
	}

	public static void main(String[] args) {
		int[] a = {2, 7, 2, 2, 7, 7};
		System.out.println(has77(a));
	}
}
