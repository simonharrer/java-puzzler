package solution;

/*
 * Based on http://strangeloop2010.com/system/talks/presentations/000/014/450/BlochLee-JavaPuzzlers.pdf
 */
public class Change {
	public static void main(String[] args) {
		// How much change do you get?

		// problem: doubles are represented as floating-point format
		// solution: caculate with integers, only put comma for output
		int result = 200 - 110;
		System.out.println(result / 100 + "," + result % 100 + " €");

		// What does it print?
		// a) 0,9 €
		// AFTER  b) 0,90 €
		// BEFORE c) 0.8999999999999999 €
		// d) none of the above
	}
}
