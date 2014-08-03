package warmup1;

public class StringE {
	public boolean stringE(String str) {
		int eCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'e')
				eCount++;
		}
		if (eCount >= 1 && eCount <= 3) {
			return true;
		}
		return false;
	}
}
