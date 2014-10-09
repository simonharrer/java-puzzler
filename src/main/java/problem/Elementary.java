package problem;

/*
 * Based on http://strangeloop2010.com/system/talks/presentations/000/014/450/BlochLee-JavaPuzzlers.pdf
 */
public class Elementary {

	public static void main(String[] args) {
		System.out.println(12345 + 5432l);
		System.out.println(01234 + 43210);

		// what does it print?
		// (a) 17777 44444
		// (b) 17777 43878
		// (c) 66666 44444
		// (d) 66666 43878
	}
}
