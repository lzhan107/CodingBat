package array1;

public class FirstLast6 {
	public boolean firstLast6(int[] nums) {
		int len = nums.length;

		if (nums[0] == 6 || nums[len - 1] == 6)
			return true;

		return false;
	}
}
