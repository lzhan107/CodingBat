package array2;

public class Sum28 {
	public static boolean sum28(int[] nums){
		int sum2 = 0;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 2)
				sum2 += nums[i];
		}
		return sum2 == 8;
	}
}
