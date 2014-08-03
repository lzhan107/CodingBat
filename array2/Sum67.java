package array2;

public class Sum67 {
	public static int sum67(int[] nums){
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 6){
				for (int j = i; j <= nums.length - 1; j++){
					if (nums[j] == 7){
						i = j; 
						break;
					}
				}
			}else{
				sum += nums[i];
			}
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int [] a = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
		System.out.println(sum67(a));
	}
}
