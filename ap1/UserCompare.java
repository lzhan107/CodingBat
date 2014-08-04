package ap1;

public class UserCompare {
	public static int userCompare(String aName, int aId, String bName, int bId) {
		int nameOrder = aName.compareToIgnoreCase(bName);
		if (nameOrder == 0) {
			if (aId < bId) {
				return -1;
			} else if (aId > bId) {
				return 1;
			} else {
				return 0;
			}
		} else if (nameOrder < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(userCompare("bb", 1, "zz", 2));
	}
}
