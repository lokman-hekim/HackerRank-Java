package lokmanhekim.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {

	public static void main(String[] args) {

		int[] ar = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20, 50, 50, 20 };
		int n = ar.length;
		int result = sockMerchant(n, ar);

		System.out.print(result);
	}

	static int sockMerchant(int n, int[] ar) {

		int retVal = 0;
		int cval = 0;

		Map<Integer, Integer> dictEs = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			cval = ar[i];
			if (dictEs.keySet().contains(cval)) {
				dictEs.put(cval, dictEs.get(cval) + 1);
				;
			} else {
				dictEs.put(cval, 1);
			}
		}

		Object[] valArr = dictEs.values().toArray();
		for (int j = 0; j < valArr.length; j++) {
			retVal += Integer.parseInt(valArr[j].toString()) / 2;
		}

		return retVal;
	}

}
