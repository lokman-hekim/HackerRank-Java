package lokmanhekim.hackerRank;

import java.io.Console;

public class TwoDimensionArrayDs {

	public static void main(String[] args) {
		try {
			String[] strArr = new String[] { "-1 -1 0 -9 -2 -2", "-2 -1 -6 -8 -2 -5", "-1 -1 -1 -2 -3 -4",
					"-1 -9 -2 -4 -4 -5", "-7 -3 -3 -2 -9 -9", "-1 -3 -1 -2 -4 -5" };

			int[][] arr = new int[6][6];

			for (int i = 0; i < 6; i++) {
				String[] arrRowItems = strArr[i].split(" ");

				for (int j = 0; j < 6; j++) {
					int arrItem = Integer.parseInt(arrRowItems[j]);
					arr[i][j] = arrItem;
				}
			}

			int result = hourglassSum(arr);
			System.out.print(result);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	static int hourglassSum(int[][] arr) {
		int retVal = Integer.MIN_VALUE;
		int highest = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr.length - 2; j++) {
				highest = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (highest > retVal) {
					retVal = highest;
				}
			}
		}

		return retVal;
	}

}
