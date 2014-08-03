package string1;

public class WithoutX2 {
	public String withoutX2(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (i < 2) {
				if (str.charAt(i) != 'x') {
					temp += "" + str.charAt(i);
				}
			} else {
				temp += "" + str.charAt(i);
			}
		}
		return temp;
	}
}
