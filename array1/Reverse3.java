package array1;

public class Reverse3 {
	public int[] reverse3(int[] nums) {

		int[] temp = new int[3];
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			temp[len - 1 - i] = nums[i];
		}
		return temp;
	}
}
