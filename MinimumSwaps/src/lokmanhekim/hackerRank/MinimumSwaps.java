package lokmanhekim.hackerRank;

public class MinimumSwaps {

	public static void main(String[] args) {

		String[] qItems = "1 3 5 2 4 6 7".split(" ");
		int[] arr = new int[qItems.length];
		for (int i = 0; i < qItems.length; i++) {
			int qItem = Integer.parseInt(qItems[i]);
			arr[i] = qItem;
		}
		
        int res = minimumSwaps(arr);

        System.out.println(res);

	}
	 static int minimumSwaps(int[] arr) {

		 int retVal = 0;
         int indexOfVal = 0;
         for (int i = 0; i < arr.length; i++)
         {
             if (arr[i] != (i + 1))
             {
                 while (arr[i] != i + 1)
                 {
                     indexOfVal = 0;
                     indexOfVal = arr[arr[i] - 1];
                     arr[arr[i] - 1] = arr[i];
                     arr[i] = indexOfVal;
                     retVal++;
                 }
             }
         }
         return retVal;
	    }

}
