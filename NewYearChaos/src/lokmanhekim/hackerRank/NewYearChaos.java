package lokmanhekim.hackerRank;

public class NewYearChaos {

	public static void main(String[] args) {

		String[] qItems = "2,5,1,3,4".split(",");
		int[] q = new int[qItems.length];
		for (int i = 0; i < qItems.length; i++) {
			int qItem = Integer.parseInt(qItems[i]);
			q[i] = qItem;
		}

		minimumBribes(q);

	}

	static void minimumBribes(int[] q) {

		String retval = "";

		int bribeCount = 0;
		int diff = 0;
		int[] idealOrder = new int[q.length];
		for (int i = 0; i < q.length; i++) {
			idealOrder[i] = i + 1;
		}

		for (int i = 0; i < q.length; i++) {
			if (idealOrder[i] != q[i]) {
				if (idealOrder[i + 1] == q[i]) {
					diff = 1;
				} else if (idealOrder[i + 2] == q[i]) {
					diff = 2;
				} else {
					retval = "Too chaotic";
					break;
				}

				bribeCount += diff;
				for (int j = i + diff; j > i; j--) {
					idealOrder[j] = idealOrder[j - 1];
				}
				idealOrder[i] = q[i];

			}
			diff = 0;

		}
		if (retval == "") {
			retval = String.valueOf(bribeCount);
		}
		System.out.println(retval);

	}

}
