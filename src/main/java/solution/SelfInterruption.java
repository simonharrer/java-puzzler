package solution;

public class SelfInterruption {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();

		// problem: Thread.interrupted() clears its state, is no simple getter
		// solution: do not call twice by using a variable to store it

		boolean interrupted = Thread.interrupted();
		if (interrupted) {
			System.out.println("Interrupted: " + interrupted);
		} else {
			System.out.println("Not interrupted: " + interrupted);
		}

		// what does it print?
		// BEFORE a) Interrupted: false
		// AFTER b) Interrupted: true
		// c) Not interrupted: false
		// d) Not interrupted: true
		// e) none of the above
	}
}
