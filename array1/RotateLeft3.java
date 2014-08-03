package array1;

public class RotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		int offSet = 1;
		while (offSet-- > 0) {
			int tIdx = nums.length - 1;
			int hElem = nums[0];
			for (int idx = 0; idx <= tIdx; idx++) {
				if (idx != tIdx)
					nums[idx] = nums[idx + 1];
			}
			nums[tIdx] = hElem;
		}
		return nums;
	}
}
