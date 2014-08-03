package array2;

public class TenRun {
	public static int[] tenRun(int[] nums){
		for (int i = 0; i < nums.length; i++){
			if (nums[i] % 10 == 0){
				for (int j = i+1; j< nums.length; j++){
					if(nums[j] % 10 == 0){
						i = j-1;
						break;
					}
					nums[j] = nums[i];
				}
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = {10, 1, 20, 2};
		int[] b = tenRun(a);
		for (int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
	}
}
