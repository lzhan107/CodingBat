package warmup2;

public class Array123 {
	public boolean array123(int[] nums) {

		if (nums.length < 3)
			return false;

		for (int i = 0; i < nums.length; i++) {
			if (i + 2 <= nums.length - 1) {
				if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
					return true;
				}
			}
		}

		return false;
	}

}
