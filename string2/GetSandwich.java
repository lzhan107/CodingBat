package string2;

public class GetSandwich {
	public String getSandwich(String str) {
		if (str.length() < 11)
			return "";

		int count = 0;
		int idx = 0;
		// Eliminate the back "bread"
		for (int i = 0; i < str.length() - 4; i++) {
			if ("bread".equals(str.substring(i, i + 5))) {
				count++;
				idx = i;
			}
		}

		if (count < 2)
			return "";

		String sub = str.substring(0, idx);
		int idx2 = 0;
		// Eliminate the front "bread"
		// If there are more than 2 "bread"s, we need to use the outter ones.
		// The first for-loop eliminates the last one, in the second loop,
		// we need to break once we see the first "bread"
		for (int i = 0; i < sub.length() - 5; i++) {
			if ("bread".equals(sub.substring(i, i + 5))) {
				idx2 = i;
				break;
			}
		}

		return sub.substring(idx2 + 5, sub.length());
	}
}
