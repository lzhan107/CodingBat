package recursion1;

public class ParenBit {
	public String parenBit(String str) {
		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
			return str;

		return parenBit(str.substring(str.indexOf('('), str.indexOf(')') + 1));
	}
}
