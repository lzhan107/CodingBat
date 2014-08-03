package warmup2;

public class ArrayFront9 {
	public boolean arrayFront9(int[] nums) {
		int len = nums.length;

		for (int i = 0; i < len; i++) {
			if (nums[i] == 9 && i < 4) {
				return true;
			}
		}
		return false;
	}
}
