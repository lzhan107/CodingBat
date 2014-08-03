package array2;

public class Either24 {
	public static boolean either24(int[] nums){
		boolean double2 = false;
		boolean double4 = false;
		
		for (int i = 0; i < nums.length - 1; i++){
			if (nums[i] == 2 && nums[i+1] == 2)
				double2 = true;
			if (nums[i] == 4 && nums[i+1] == 4)
				double4 = true;
		}
		
		if (!double2 && !double4)
			return false;
		
		return !(double2 && double4);
	}
}
