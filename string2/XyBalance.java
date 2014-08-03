package string2;

public class XyBalance {
	public boolean xyBalance(String str) {

		if (str.length() < 1)
			return true;

		int xIdx = -1;
		int yIdx = -1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x')
				xIdx = i;

			if (str.charAt(i) == 'y')
				yIdx = i;
		}

		if ((xIdx < yIdx) || (xIdx == -1))
			return true;

		return false;
	}
}
