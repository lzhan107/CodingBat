package array1;

public class MakeEnds {
	public int[] makeEnds(int[] nums) {

		int[] a = new int[2];
		if (nums.length == 1) {
			a[0] = a[1] = nums[0];
		}

		if (nums.length == 2)
			return nums;

		a[0] = nums[0];
		a[1] = nums[nums.length - 1];

		return a;
	}
}
