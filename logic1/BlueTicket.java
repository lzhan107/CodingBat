package logic1;

public class BlueTicket {
	public int blueTicket(int a, int b, int c) {
		int x = a + b;
		int y = b + c;
		int z = a + c;

		if (x == 10 || y == 10 || z == 10)
			return 10;

		if (x == 10 + y || x == 10 + z)
			return 5;

		return 0;
	}
}
