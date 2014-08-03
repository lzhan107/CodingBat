package warmup2;

public class StringX {
	public String stringX(String str) {
		if (str.length() < 3)
			return str;
		else {
			char start = str.charAt(0);
			char end = str.charAt(str.length() - 1);
			String s = "" + start;
			for (int i = 1; i < str.length() - 1; i++) {
				if (str.charAt(i) != 'x')
					s = s + str.charAt(i);
			}
			s = s + end;
			return s;
		}
	}
}
