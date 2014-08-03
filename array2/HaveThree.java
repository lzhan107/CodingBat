package array2;

public class HaveThree {
	public static boolean haveThree(int[] nums){
		for (int i = 0; i < nums.length - 4; i++){
			if (nums[i]== 3 && nums[i+2] == 3 && nums[i+4] == 3){
				for (int j = i+5; j < nums.length; j++){
					if (nums[j] == 3)
						return false;
				}
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] a = {3, 1, 3, 1, 3};
		System.out.println(haveThree(a));
	}
}
