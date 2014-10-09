package solution;
/*
 * Based on http://strangeloop2010.com/system/talks/presentations/000/014/450/BlochLee-JavaPuzzlers.pdf
 */
public class LongDivision {
	private static final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
	private static final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;

	// problem: long can hold value, but computation overflows
	// solution: use computation with long values via explicit L

	public static void main(String[] args) {
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

		// What does it print?
		// BEFORE a) 5
		// AFTER  b) 1000
		// c) 5000
		// d) throws an exception
	}
}
