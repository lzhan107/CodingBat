package array2;

public class Has12 {
	public static boolean has12(int[] nums){
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 1){
				for (int j = i; j < nums.length; j++){
					if (nums[j] == 2)
						return true;
				}
			}
		}
		return false;
	}
}
