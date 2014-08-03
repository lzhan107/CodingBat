package string2;

public class EndOther {
	public boolean endOther(String a, String b) {
		String lowA = a.toLowerCase();
		String lowB = b.toLowerCase();
		int aLen = a.length();
		int bLen = b.length();

		if (aLen < bLen) {
			if (lowA.equals(lowB.substring(lowB.length() - aLen, lowB.length())))
				return true;
		} else {
			if (lowB.equals(lowA.substring(lowA.length() - bLen, lowA.length())))
				return true;
		}

		return false;
	}
}
