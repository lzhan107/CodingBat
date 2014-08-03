package array3;

public class MaxMirror {
	/**
	 * This is not recommended solution - too long.
	 */
	/*public static int maxMirror(int[] nums){
		for (int i = nums.length; i >= 1; i--){
			if (foundMaxMirror(i, nums))
				return i;
		}
		return 0;
	}
	
	public static boolean foundMaxMirror(int currLen, int[] nums){
		int[] arr1 = new int[currLen];
		int[] arr2 = new int[currLen];
		boolean isMirror = false;
		int frontIdx = nums.length - currLen;
		int trailIdx = nums.length - 1;
		
		while(nums.length - frontIdx >= currLen && isMirror == false){
			isMirror = isMirror(arr1, arr2, frontIdx, trailIdx, currLen, nums);
			frontIdx++;
			trailIdx--;
		}
		
		return isMirror;
	}
	
	public static boolean isMirror(int[] arr1, int[] arr2, int frontIdx, int trailIdx, int currLen, int[] nums){
		for (int m = frontIdx, n = trailIdx; m < nums.length; m++, n--){
			arr1[m] = nums[m];
			arr2[n] = nums[n];
			if (m + 1 == currLen)
				break;
		}
		return isArrayReversed(arr1, arr2);
	}
	
	public static boolean isArrayReversed(int[] arr1, int[] arr2){
		for (int i = 0, j = arr2.length-1; i < arr1.length; i++, j--){
			if (arr1[i] != arr2[j])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 1, 4};
		System.out.println(maxMirror(a));
	}*/
	
	/**
	 * Step 1: Take {1, 2, 1, 4} as example, starting the with max length, which is 4
	 * Step 2: Compare array in both directions: {1, 2, 1, 4} & {4, 1, 2, 1}
	 * Step 3: Compare until the last element, if the last element is equal return 4, else decrease the size to 3
	 * Step 4: Now the length is 3, for the first array, it could be {1, 2, 1} or {2, 1, 4}; for the second array, it could be {4, 1, 2} or {1, 2, 1},
	 *         so we need two for-loops to compare 4 times maximum, if two arrays are mirroring, then return 3 (no need to compare the remaining, since
	 *         all their lengths are 3), if not then go to step 2, decrease the size to 2.
	 * Step 5: Once above steps are completed, then return the final max length of mirror.
	 */
	public static int maxMirror(int[] nums){
		//This is starting from the max length, then decrease
		for (int i = nums.length; i >= 1; i--){
			//Starting with 4, compare two arrays, if not mirroring, then continue
			if (!isMirror(nums, i))
				continue;
			return i;
		}
		
		return 0;
	}
	
	public static boolean isMirror(int[] nums, int currLen){
		boolean isMirror = false;
		int[] arr = new int[currLen];
		
		for (int i = 0; i < currLen; i++){
			for (int j = i; j < currLen; j++){
				arr[j] = nums[j];
				//Make sure the length is equal to currLen
				if ((j-i+1) == currLen){
					//Compare with another array
					if (compareWithAnother(arr, nums, currLen)){
						isMirror = true;
					}
					break;
				}
			}
			if (currLen == nums.length)
				break;
		}
		
		return isMirror;
	}
	
	public static boolean compareWithAnother(int[] arrToCompare, int[] nums, int currLen){
		boolean foundMirror = false;
		int[] arr = new int[currLen];
		int diff = nums.length - currLen;
		
		for (int i = nums.length - 1; i >= 0; i--){
			for (int j = i; j >=0; j--){
				if (j - diff >=0)
				arr[j-diff] = nums[j-diff];
				if (i-j+1 == currLen){
					if (isEqual(arrToCompare, arr)){
						foundMirror = true;
					}
					break;
				}
			}
			if (currLen == nums.length)
				break;
		}
		
		return foundMirror;
	}
	
	public static boolean isEqual(int[] arr1, int[] arr2){
		for (int i = 0, j = arr2.length-1; i < arr1.length; i++, j--){
			if (arr1[i] != arr2[j])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a= {1, 2, 1, 4};
		System.out.println(maxMirror(a));
	}
}
