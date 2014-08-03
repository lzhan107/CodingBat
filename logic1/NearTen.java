package logic1;

public class NearTen {
	public boolean nearTen(int num) {
		if ((num % 10 >= 8) || (num % 10 <= 2))
			return true;
		return false;
	}
}
