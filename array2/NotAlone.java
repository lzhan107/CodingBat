package array2;

public class NotAlone {
	public static int[] notAlone(int[] nums, int val) {
		if (nums.length < 3)
			return nums;

		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == val && nums[i - 1] != nums[i]
					&& nums[i + 1] != nums[i]) {
				nums[i] = Math.max(nums[i-1], nums[i+1]);
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = notAlone(a, 2);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
