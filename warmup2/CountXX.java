package warmup2;

public class CountXX {
	int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x' && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'x') {
					count++;
				}
			}
		}
		return count;
	}
}
