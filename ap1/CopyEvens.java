package ap1;

public class CopyEvens {
	public static int[] copyEvens(int[] nums, int count) {
		int[] evenNums = new int[count];
		int firstEvenIdx = 0;
		for (int i = 0; i < count; i++) {
			for (int j = firstEvenIdx; j < nums.length; j++) {
				if (nums[j] % 2 == 0) {
					firstEvenIdx = j+1;
					evenNums[i] = nums[j];
					break;
				}
			}
		}

		return evenNums;
	}
}
