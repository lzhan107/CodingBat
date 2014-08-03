package string3;

public class MirrorEnds {
	public static String mirrorEnds(String string) {
//		if (string.length() < 2)
//		    return "";
		  
		  //int fEnd = string.length() / 2 - 1;
		  
		  String s1 = "";
		  String s2 = "";
		  
		  for (int i = string.length() - 1; i >=0; i--){
		    s1 = string.substring(0,i+1);
		    
		    for (int j = string.length() - 1; j >= string.length() - 1 - i; j--){
		      s2 += "" + string.charAt(j);
		    }
		    
		    if (s1.equals(s2)){
		      return s1;
		    }
		    
		    s2 = "";
		  }
		  
		  return "";
	}
	
	public static void main(String[] args) {
//		System.out.println(mirrorEnds("abXYZba"));
//		System.out.println(mirrorEnds("aba"));
		System.out.println(mirrorEnds("x"));
	}
}
