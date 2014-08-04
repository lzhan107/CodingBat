package recursion1;

public class CountHi2 {
	public int countHi2(String str) {
		if (str.length() < 2)
			return 0;

		if (str.contains("hi")) {
			int idx = str.indexOf("hi");
			if (idx == 0 || (idx > 0 && str.charAt(idx - 1) != 'x'))
				return 1 + countHi2(str.substring(idx + 2));
			else
				return countHi2(str.substring(idx + 2));
		}

		return 0;
	}
}
