package ap1;

public class CopyEndy {
	public static int[] copyEndy(int[] nums, int count) {
		int[] endy = new int[count];
		int firstEndyIdx = 0;
		for (int i = 0; i < count; i++) {
			for (int j = firstEndyIdx; j < nums.length; j++) {
				if (isEndy(nums[j])) {
					endy[i] = nums[j];
					firstEndyIdx = j + 1;
					break;
				}
			}
		}
		return endy;
	}

	public static boolean isEndy(int n) {
		return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
	}
	
	public static void main(String[] args) {
		int[] a  = {9, 11, 90, 22, 6};
		int[] b = copyEndy(a, 2);
		for (int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
	}
}
