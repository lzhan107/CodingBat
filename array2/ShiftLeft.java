package array2;

public class ShiftLeft {
	public static int[] shiftLeft(int[] nums){
		if (nums.length < 1)
			return nums;
		int fElem = nums[0];
		for (int i = 0; i < nums.length; i++){
			if (i !=  nums.length -1)
				nums[i] = nums[i+1];
		}
		nums[nums.length - 1] = fElem;
		
		return nums;
	}
}
