package solution;

/*
 * Based on http://strangeloop2010.com/system/talks/presentations/000/014/450/BlochLee-JavaPuzzlers.pdf
 */
public class Elementary {

	public static void main(String[] args) {
		// problem: the number 1 vs the letter l => 5432 is a long value
		// solution: never use the letter l in numbers or variables
		System.out.println(12345 + 5432L);

		// problem: prefixed with 0 means octal (base 8 instead of base 10)
		// solution: do not prefix with zero
		System.out.println(1234 + 43210);

		// what does it print?
		// AFTER (a) 17777 44444
		// BEFORE (b) 17777 43878
		// (c) 66666 44444
		// (d) 66666 43878
	}
}
