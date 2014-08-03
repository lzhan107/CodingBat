package warmup2;

public class NoTriples {
	public boolean noTriples(int[] num) {
		if (num.length < 3)
			return true;

		// Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Map<Integer, Integer> map = new HashMap<>();
		//
		// for (int i = 0; i < num.length; i++){
		// if (map.containsKey(num[i])){
		// int time = map.get(num[i]);
		// time++;
		// map.put(num[i], time);
		// }else{
		// map.put(num[i], 1);
		// }
		// }
		//
		// for (Map.Entry<Integer, Integer> entry: map.entrySet()){
		// if (entry.getValue() >= 3)
		// return false;
		// }

		for (int i = 0; i < num.length - 2; i++) {
			int first = num[i];
			if (num[i + 1] == first && num[i + 2] == first)
				return false;
		}

		return true;
	}
}
