package ap1;

import java.util.Arrays;

public class MergeTwo {
	public static String[] mergeTwo(String[] a, String[] b, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			if (!sb.toString().contains(b[i]))
				sb.append(b[i]);
		}
		char[] ch = sb.toString().toCharArray();
		Arrays.sort(ch);
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = ch[i] + "";
		}
		return s;
	}
}
