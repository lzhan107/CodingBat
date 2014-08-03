package warmup2;

public class StringSplosion {
	public String stringSplosion(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			String s = "";
			for (int j = 0; j <= i; j++) {
				s += "" + str.charAt(j);
			}
			result += s;
		}
		return result;
	}
}
