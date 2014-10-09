package problem;
/*
 * Based on http://strangeloop2010.com/system/talks/presentations/000/014/450/BlochLee-JavaPuzzlers.pdf
 */
public class LongDivision {
	private static final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
	private static final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;

	public static void main(String[] args) {
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

		// What does it print?
		// a) 5
		// b) 1000
		// c) 5000
		// d) throws an exception
	}
}
