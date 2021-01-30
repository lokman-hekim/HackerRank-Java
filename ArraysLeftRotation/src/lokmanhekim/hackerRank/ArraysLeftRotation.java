package lokmanhekim.hackerRank;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		String scanner = "1 2 3 4 5";
		String[] nd = scanner.split(" ");

		int n = nd.length;

		int d = 3;

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(nd[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		String printVal = "";
		for (int i = 0; i < result.length; i++) {
			printVal += String.valueOf(result[i]) + " ";

		}
		System.out.print(printVal);

	}

	static int[] rotLeft(int[] a, int d) {
		   int[] retVal = new int[a.length];

           int j = 0;
           for (int i = d; i < a.length; i++)
           {
               retVal[j] = a[i];
               j++;
           }
           for (int k = 0; k < d; k++)
           {
               retVal[j] = a[k];
               j++;
           }

           return retVal;
	}

}
