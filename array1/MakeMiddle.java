package array1;

public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		int len = nums.length;
		int[] a = new int[2];
		a[0] = nums[len / 2 - 1];
		a[1] = nums[len / 2];

		return a;
	}
}
