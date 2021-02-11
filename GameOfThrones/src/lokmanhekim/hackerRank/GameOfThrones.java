package lokmanhekim.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cdcdcdcdeeeef";

		String result = gameOfThrones(s);

		System.out.print(result);
	}

	public static String gameOfThrones(String s) {
		String retVal = "YES";

		Map<String, Integer> counts = new HashMap<String, Integer>();

		String item;
		for (int i = 0; i < s.length(); i++) {
			item = String.valueOf(s.charAt(i));

			if (counts.keySet().contains(item)) {
				counts.replace(item, counts.get(item) + 1);
			} else {
				counts.put(item, 1);
			}
		}

		Boolean isOdd = false;
		Object[] valArr = counts.values().toArray();
		for (int j = 0; j < valArr.length; j++) {
			if (Integer.parseInt(valArr[j].toString()) % 2 != 0) {
				if (isOdd == false) {
					isOdd = true;
				} else {
					retVal = "NO";
					break;
				}
			}

		}

		return retVal;

	}

}
