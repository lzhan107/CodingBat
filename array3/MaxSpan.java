package array3;

public class MaxSpan {
	public static int maxSpan(int[] nums){
		int maxSpan = 0;
		for (int i = 0; i < nums.length; i++){
			for (int j = nums.length - 1; j >=0; j--){
				if (nums[i] == nums[j] && maxSpan < (j-i+1)){
					maxSpan = j - i + 1;
					break;
				}
			}
		}
		
		return maxSpan;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 4, 2, 1, 4, 4, 4};
		System.out.println(maxSpan(a));
	}
}
