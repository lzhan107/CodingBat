package array2;

public class Sum13 {
	public static int sum13(int[] nums){
		int sum = 0;
		if(nums.length < 1)
			return 0;
		
		for (int i = 0; i < nums.length; i++){
			if (nums[i] != 13){
				sum += nums[i];
			}else{
				i++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,2,1,13};
		System.out.println(sum13(a));
	}
}
