package problem;

public class SelfInterruption {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();

		if (Thread.interrupted()) {
			System.out.println("Interrupted: " + Thread.interrupted());
		} else {
			System.out.println("Not interrupted: " + Thread.interrupted());
		}

		// what does it print?
		// a) Interrupted: false
		// b) Interrupted: true
		// c) Not interrupted: false
		// d) Not interrupted: true
		// e) none of the above
	}
}
