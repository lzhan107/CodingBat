package array3;

public class LinearIn {
	public static boolean linearIn(int[] outer, int[] inner){
		int idx = 0;
		for (int i = 0; i < inner.length; i++){
			for (int j = idx; j < outer.length; j++){
				if (inner[i] == outer[j]){
					idx = j;
					break;
				}
				if (j == outer.length -1)
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 6};
		int[] b = {2, 3,4};
		System.out.println(linearIn(a, b));
	}
}
