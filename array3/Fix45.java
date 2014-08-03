package array3;

public class Fix45 {
	public static int[] fix45(int[] nums){
		int fourIdx = 0;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == 4){
				fourIdx = i;
				for (int j = 0 ; j < nums.length; j++){
					if (nums[j] == 5 && ( j == 0 || nums[j-1] != 4)){
						int temp = nums[i+1];
						nums[i+1] = nums[j];
						nums[j] = temp;
						break;
					}
				}
				i = fourIdx;
			}
		}
		return nums;
	}
	
	public static void main(String[] args) {
		
	}
}
