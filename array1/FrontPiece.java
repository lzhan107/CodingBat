package array1;

public class FrontPiece {
	public int[] frontPiece(int[] nums) {
		if (nums.length < 3)
			return nums;

		int[] a = new int[2];
		a[0] = nums[0];
		a[1] = nums[1];

		return a;
	}
}
