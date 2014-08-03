package array1;

public class Sum2 {
	public int sum2(int[] nums) {
		if (nums.length < 1)
			return 0;

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 2)
				break;
			sum += nums[i];
		}

		return sum;
	}
}
