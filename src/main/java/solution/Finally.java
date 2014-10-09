package solution;

/*
 * book Java Puzzlers
 */
public class Finally {
	public static void main(String[] args) {
		try {
			// System.exit(42);
			System.out.println("Hello World");
		} finally {
			System.out.println("finally");
		}

		// problem: as soon as System.exit is reached, the JVM terminates
		// solution: do not use System.exit unless really really justifyable!

		// what does it print?
		// a) Hello World
		// b) 42
		// c) finally
		// AFTER  d) Hello World\nfinally
		// BEFORE e) none of the above
	}
}
