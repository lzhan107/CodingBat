package array2;

public class ZeroFront {
	public static int[] zeroFront(int[] nums){
		
		for (int i = nums.length - 1; i >= 0; i--){
			if (nums[i] == 0){
				for (int j = i - 1; j >= 0; j--){
					if (nums[j] != 0){
						int temp = nums[j];
						nums[j] = nums[i];
						nums[i] = temp;
					}
				}
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 0, 0, 1};
		int[] b = zeroFront(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
