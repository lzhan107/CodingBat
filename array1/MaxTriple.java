package array1;

public class MaxTriple {
	public int maxTriple(int[] nums) {
		if (nums.length < 3)
			return nums[0];

		int first = nums[0];
		int last = nums[nums.length - 1];
		int mid = nums[nums.length / 2];

		return Math.max(Math.max(first, last), mid);
	}
}
