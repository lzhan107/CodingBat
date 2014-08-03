package string3;

public class MaxBlock {
	public static int maxBlock(String str) {
		int count = 1;
		int max = 1;
		int temp = 0;

		if (str.length() < 2)
			return str.length();

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				temp = ++count;
			} else {
				count = 1;
				continue;
			}
			
			if (max < temp)
				max = temp;
		}

		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(maxBlock("hoopla"));
		System.out.println(maxBlock("abbCCCddBBBxx"));
		System.out.println(maxBlock(""));
	}
}
