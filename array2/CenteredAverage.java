package array2;

public class CenteredAverage {
	
	public static int centeredAvg(int[] nums){
		int min = nums[0];
		int max = nums[0];
		int sum = 0;
		
		for (int i = 0; i < nums.length - 1; i++){
			if (max < Math.max(nums[i], nums[i+1]))
				max = Math.max(nums[i], nums[i+1]);
			
			if (min > Math.min(nums[i], nums[i+1]))
				min = Math.min(nums[i], nums[i+1]);
			
			sum += nums[i];
		}
		sum += nums[nums.length-1];
		
		return (sum - max - min) / (nums.length - 2);
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 100};
		System.out.println(centeredAvg(a));
	}
}
