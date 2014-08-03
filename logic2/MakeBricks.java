package logic2;

public class MakeBricks {
	public boolean makeBricks(int small, int big, int goal) {
		// Check the total, see if it is enough
		if (big * 5 + small < goal)
			return false;
		// If it goes here, meaning the bricks are enough
		// Check the number of small bricks
		if (goal % 5 > small)
			return false;
		return true;
	}
}
