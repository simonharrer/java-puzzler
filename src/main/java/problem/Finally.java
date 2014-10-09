package problem;

/*
 * book Java Puzzlers
 */
public class Finally {
	public static void main(String[] args) {
		try {
			System.exit(42);
			System.out.println("Hello World");
		} finally {
			System.out.println("finally");
		}
		
		// what does it print?
		// a) Hello World
		// b) 42
		// c) finally
		// d) Hello World\nfinally
		// e) none of the above
	}
}
