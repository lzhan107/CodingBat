package array2;

public class TwoTwo {
	public static boolean twoTwo(int[] nums){
		/*int twoCount = 0;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 2)
				twoCount++;
		}
		
		return twoCount % 2 == 0;*/
		
		int[] a = new int[nums.length+2];
		a[0] = a[nums.length+1] = 0;
		for (int i = 0; i < nums.length; i++){
			a[i+1] = nums[i];
		}
		
		for (int i = 1; i < a.length - 1; i++){
			if (a[i] == 2){
				if (a[i-1] != 2 && a[i+1] != 2)
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = {4, 2, 2, 3};
		System.out.println(twoTwo(a));
	}
}
