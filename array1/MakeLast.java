package array1;

public class MakeLast {
	public int[] makeLast(int[] nums) {
		int len = nums.length;

		int[] a = new int[len * 2];
		int lastELem = nums[len - 1];

		for (int i = 0; i < len * 2; i++) {
			if (i == len * 2 - 1)
				a[i] = lastELem;
			else
				a[i] = 0;
		}

		return a;
	}
}
