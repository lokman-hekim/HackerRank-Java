package lokmanhekim.hackerRank;

public class RepeatedStrings {

	public static void main(String[] args) {
		long n = 1000000000;
		String s = "a";

		long result = repeatedString(s, n);
		System.out.println("result: " + String.valueOf(result));

	}

	static long repeatedString(String s, long n) {

        long retVal = 0;

        long repeat_count = (n / (long)s.length()) ;
        long remainder = n % (long)s.length();
        long reOccurA= s.chars().filter(ch->ch=='a').count();
        retVal = reOccurA * repeat_count;

        reOccurA= s.substring(0,(int)remainder).chars().filter(ch->ch=='a').count();
        retVal += reOccurA;
        return retVal;

    }
}
