package string2;

public class CatDog {
	public boolean catDog(String str) {
		String catSub = "cat";
		String dogSub = "dog";
		int catCount = 0;
		int dogCount = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (catSub.equals(str.substring(i, i + 3))) {
				catCount++;
			}
			if (dogSub.equals(str.substring(i, i + 3))) {
				dogCount++;
			}
		}

		return catCount == dogCount;
	}
}
