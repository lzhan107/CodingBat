package array2;

public class Pre4 {
	public static int[] pre4(int[] nums) {
		int[] result = new int[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				result = new int[i];
				for (int j = 0; j < i; j++) {
					result[j] = nums[j];
				}
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 1 };
		int[] b = pre4(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
