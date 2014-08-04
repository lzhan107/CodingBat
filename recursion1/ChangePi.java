package recursion1;

public class ChangePi {
	public String changePi(String str) {
		if (!str.contains("pi"))
			return str;
		return changePi(str.replaceAll("pi", "3.14"));
	}
}
