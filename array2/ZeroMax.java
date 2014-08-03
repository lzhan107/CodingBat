package array2;

public class ZeroMax {
	public static int[] zeroMax(int[] nums){
		
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 0){
				int maxOdd = 0;
				for (int j = i+1; j < nums.length; j++){
					if (maxOdd < nums[j] && nums[j] % 2 != 0)
						maxOdd = nums[j];
				}
				nums[i] = maxOdd;
			}
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = {0, 4, 0, 3};
		int[] b = zeroMax(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
