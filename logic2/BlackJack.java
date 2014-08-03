package logic2;

public class BlackJack {
	public int blackjack(int a, int b) {
		if (a <= 21 && b <= 21)
			return a > b ? a : b;

		if ((a <= 21 && b > 21) || (b <= 21 && a > 21))
			return a < b ? a : b;

		return 0;
	}
}
