package recursion1;

public class Array11 {
	public int array11(int[] nums, int index) {
		if (nums.length == 0)
			return 0;

		if (index == nums.length - 1)
			return nums[index] == 11 ? 1 : 0;

		if (nums[index] == 11)
			return 1 + array11(nums, index + 1);
		return array11(nums, index + 1);
	}
}
