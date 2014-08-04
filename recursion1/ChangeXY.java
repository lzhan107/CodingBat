package recursion1;

public class ChangeXY {
	public String changeXY(String str) {
		if (!str.contains("x"))
			return str;
		return changeXY(str.replace("x", "y"));
	}
}
