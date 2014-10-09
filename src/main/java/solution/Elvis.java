package solution;

import java.util.Calendar;

/*
 * based on http://www.javapuzzlers.com/java-puzzlers-sampler.pdf 
 */
public class Elvis {

	// problem: order of static methods is relevant in the class
	// solution: change order of static methods according to dependencies

	private static final int CURRENT_YEAR = Calendar.getInstance().get(
			Calendar.YEAR);
	public static final Elvis INSTANCE = new Elvis();

	private final int age;

	private Elvis() {
		age = CURRENT_YEAR - 1935;
	}

	public int beltSize() {
		return age;
	}

	public static void main(String[] args) {
		System.out.println("Elvis is " + INSTANCE.beltSize() + " years old.");

		// what does it print?
		// a) 1935
		// BEFORE b) -1935
		// AFTER c) 79
		// d) 0
		// e) none of the above
	}
}