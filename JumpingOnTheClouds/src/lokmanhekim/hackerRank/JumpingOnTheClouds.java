package lokmanhekim.hackerRank;

public class JumpingOnTheClouds {

	public static void main(String[] args) {

		String[] qItems = "0 0 0 1 0 0".split(" ");
		int[] c = new int[qItems.length];
		for (int i = 0; i < qItems.length; i++) {
			int qItem = Integer.parseInt(qItems[i]);
			c[i] = qItem;
		}
		int result = jumpingOnClouds(c);
		System.out.println("result: " + String.valueOf(result));

	}

	static int jumpingOnClouds(int[] c) {
		int shortestWay = 0;
		int i = 0;
		while (i < c.length - 1) {
			i++;
			if (i + 1 < c.length && c[i + 1] == 0) {
				shortestWay++;
				i++;
			} else {
				if (c[i] == 0) {
					shortestWay++;
				} else {
					i++;
				}
			}

		}
		return shortestWay;

	}

}
