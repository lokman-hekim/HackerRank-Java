package lokmanhekim.hackerRank;

public class CountingValleys {

	public static void main(String[] args) {

		String path = "DDUUDDUDUUUD";
		int steps = path.length();

		int result = countingValleys(steps, path);
		System.out.print(result);

	}

	public static int countingValleys(int steps, String path) {
		int valley = 0;
		int level = 0;

		char[] arrStep = path.toCharArray();

		for (int i = 0; i < steps; i++) {

			if (arrStep[i] == 'U') {
				level += 1;
			} else if (arrStep[i] == 'D') {
				level -= 1;
			}
			if (level == 0 && arrStep[i] == 'U') {
				valley++;
			}
		}
		return valley;

	}

}
