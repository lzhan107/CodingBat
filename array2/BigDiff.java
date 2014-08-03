package array2;

public class BigDiff {
	public static int bigDiff(int[] nums){
		int min = nums[0];
		int max = nums[0];
		
		for (int i = 0; i < nums.length - 1; i++){
			
			if (max < Math.max(nums[i], nums[i+1]))
				max = Math.max(nums[i], nums[i+1]);
			
			if (min > Math.min(nums[i], nums[i+1]))
				min = Math.min(nums[i], nums[i+1]);
		}
		
		return max - min;
	}
	
	public static void main(String[] args) {
		int[] a = {7, 2, 10, 9};
		System.out.println(bigDiff(a));
	}
}
