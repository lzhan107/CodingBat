package recursion1;

public class Array220 {
	public boolean array220(int[] nums, int index) {
		if (nums.length < 2)
			return false;

		if (index == nums.length)
			return false;

		if (index <= nums.length - 2 && 10 * nums[index] == nums[index + 1])
			return true;
		return array220(nums, index + 1);
	}
}
