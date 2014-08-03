package array2;

public class EvenOdd {
	public static int[] evenOdd(int[] nums){
		
		for (int i = 0; i < nums.length; i++){
			if (nums[i] % 2 == 0){
				int hElem = nums[i];
				for (int j = i; j >=0 ; j--){
					if (j != 0)
						nums[j] = nums[j-1];
				}
				nums[0] = hElem;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 0, 1, 0, 0, 1, 1};
//		int[] a = {3,3,2};
		int[] b = evenOdd(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
