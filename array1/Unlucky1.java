package array1;

public class Unlucky1 {
	public boolean unlucky1(int[] nums) {
		if (nums.length < 2)
			return false;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 3 && nums[i - 1] == 1
					&& (i == 1 || i == 2 || i == nums.length - 1)) {
				return true;
			}
		}

		return false;
	}
}
