package string2;

public class StarOut {
	public String starOut(String str) {
		if (str.length() < 1)
			return "";

		if (str.length() < 3) {
			if (str.charAt(0) != '*' && str.charAt(str.length() - 1) != '*')
				return str;
			else
				return "";
		}

		char[] temp = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*') {
				if (i == 0) {
					temp[i] = temp[i + 1] = '*';
					i = i + 1;
				} else if (i == str.length() - 1) {
					temp[i] = temp[i - 1] = '*';
				} else {
					temp[i] = temp[i - 1] = temp[i + 1] = '*';
					if (str.charAt(i + 1) != '*') {
						i = i + 1;
					}
				}
			} else {
				temp[i] = str.charAt(i);
			}
		}

		String result = "";

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != '*') {
				result += temp[i];
			}
		}

		return result;
	}
}
