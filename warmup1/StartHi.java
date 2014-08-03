package warmup1;

public class StartHi {
	public boolean startHi(String str) {
		if (str.length() < 2)
			return false;
		else
			return str.charAt(0) == 'h' && str.charAt(1) == 'i';
	}
}
