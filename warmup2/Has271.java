package warmup2;

public class Has271 {
	public boolean has271(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			int first = nums[i];
			if (nums[i + 1] == first + 5
					&& Math.abs(nums[i + 2] - (first - 1)) <= 2)
				return true;
		}

		return false;
	}
}
