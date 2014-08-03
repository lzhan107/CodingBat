package logic2;

public class MakeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		// Check the total
		if (big * 5 + small < goal)
			return -1;

		int bigNum = 0;
		for (int i = 0; i <= big; i++) {
			if (5 * i <= goal) {
				bigNum = i;
				continue;
			}
		}

		if (small >= goal - bigNum * 5)
			return goal - bigNum * 5;

		return -1;
	}
}
