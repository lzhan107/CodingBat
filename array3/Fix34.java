package array3;

public class Fix34 {
	public static int[] fix34(int[] nums){
		int threeIdx = 0;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 3){
				threeIdx = i;
				for (int j = 0 ; j < nums.length; j++){
					if (nums[j] == 4 && nums[j-1] != 3){
						int temp = nums[i+1];
						nums[i+1] = nums[j];
						nums[j] = temp;
						break;
					}
				}
				i = threeIdx;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = {3, 2, 2, 4};
		int[] b = fix34(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
