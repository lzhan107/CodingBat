package array2;

public class FizzBuzz {
	public static String[] fizzBuzz(int start, int end){
		String[] result = new String[end-start];
		for (int i = 0; i < end - start; i++){
			String s = "";
			if ((i + start) % 3 == 0)
				s += "Fizz";
			if ((i + start) % 5 == 0)
				s += "Buzz";
			if ((i + start) % 3 != 0 && (i + start) % 5 !=0)
				s += String.valueOf(i + start);
			result[i] = s;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String[] s = fizzBuzz(1, 8);
		for (int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}
}
