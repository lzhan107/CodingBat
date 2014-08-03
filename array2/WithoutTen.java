package array2;

public class WithoutTen {
	public static int[] withoutTen(int[] nums){
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 10){
				for (int j = i; j < nums.length; j++){
					if (j != nums.length - 1)
					nums[j] = nums[j+1];
				}
				nums[nums.length - 1] = 0;
				i = i - 1; 
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 99, 10};
		int[] b = withoutTen(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
