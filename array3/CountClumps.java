package array3;

public class CountClumps {
	public static int countClumps(int[] nums) {
		int num = 0;
		boolean end = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == nums[i]) {
					if (j - i > 1) {
						if (j == nums.length - 1) {
							end = true;
							break;
						}
						continue;
					}
					num++;
				} else {
					i = j - 1;
					break;
				}
			}
			if (end)
				break;
		}
		return num;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 1, 1 };
		System.out.println(countClumps(a));
	}
}
