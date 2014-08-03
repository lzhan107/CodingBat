package array3;

public class CanBanlance {
	public static boolean canBanlance(int[] nums){
		int lSum = 0;
		int rSum = 0;
		for (int i = 0; i < nums.length; i++){
			for (int l = 0; l <= i; l++){
				lSum += nums[l];
			}
			for (int r = i + 1; r < nums.length; r++){
				rSum += nums[r];
			}
			if (lSum == rSum)
				return true;
			lSum = rSum =0;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 1, 1, 2, 1};
		System.out.println(canBanlance(a));
	}
}
