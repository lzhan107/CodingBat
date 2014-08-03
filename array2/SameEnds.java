package array2;

public class SameEnds {
	public static boolean sameEnds(int[] nums, int len){
		if (len == 0)
			return true;
		
		for (int i = 0; i < nums.length; i++){
			if (nums[i] != nums[nums.length - len + i])
				return false;
			if (i+1 == len)
				break;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = {5, 6, 45, 99, 13, 5, 6};
		System.out.println(sameEnds(a, 3));
	}
}
