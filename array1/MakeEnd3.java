package array1;

public class MakeEnd3 {
	public int[] maxEnd3(int[] nums) {
		int max = nums[0] > nums[2] ? nums[0] : nums[2];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = max;
		}

		return nums;
	}
}
