package lokmanhekim.hackerRank;

public class ArrayManipulation {

	public static void main(String[] args) {

		int n = 5;
		int[][] queries = new int[3][];
		queries[0] = new int[] { 1, 2, 100 };
		queries[1] = new int[] { 2, 5, 100 };
		queries[2] = new int[] { 3, 4, 100 };

		long result = arrayManipulation(n, queries);
		System.out.println(String.valueOf(result));
	}

	static long arrayManipulation(int n, int[][] queries) {
		 long[] control = new long[n + 1];
         int a, b, k;
         for (int i = 0; i < queries.length; i++)
         {
             a = queries[i][0];
             b = queries[i][1];
             k = queries[i][2];

             control[a - 1] += k;
             control[b] -= k;
         }

         long max = Long.MIN_VALUE;
         long sum = 0;
         for (int i = 0; i < control.length; i++)
         {
             sum += control[i];
             max = Math.max(max, sum);
         }
         return max;
	}
}
