package array1;

public class MidThree {
	public int[] midThree(int[] nums) {
		int len = nums.length;
		int[] a = new int[3];
		a[0] = nums[len / 2 - 1];
		a[1] = nums[len / 2];
		a[2] = nums[len / 2 + 1];

		return a;
	}
}
