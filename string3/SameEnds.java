package string3;

public class SameEnds {

	public static String sameEnds(String string) {
		  if (string.length() < 2)
		    return "";
		  
		  int fEnd = string.length() / 2 - 1;
		  
		  String s1 = "";
		  String s2 = "";
		  
		  for (int i = fEnd; i >=0; i--){
		    s1 = string.substring(0,i+1);
		    s2 = string.substring(string.length() - 1 - i, string.length());
		    if (s1.equals(s2)){
		      return s1;
		    }
		  }
		  
		  return "";
		}
	
	public static void main(String[] args) {
		System.out.println(sameEnds("xavaXYZjava"));
	}
}
