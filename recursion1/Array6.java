package recursion1;

public class Array6 {
	public boolean array6(int[] nums, int index) {
		if (nums.length == 0)
			return false;
		if (index == nums.length - 1)
			return nums[index] == 6;
		if (nums[index] == 6)
			return true;
		return array6(nums, index + 1);
	}
}
