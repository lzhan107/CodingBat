package array2;

public class Post4 {
	public static int[] post4(int[] nums) {
		int[] result = new int[0];
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4){
				result = new int[nums.length - 1 - i];
				for (int j = i + 1; j < nums.length; j++){
					result[j-i-1] = nums[j];
				}
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] a = {4, 4, 1, 2, 3};
		int[] b = post4(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
