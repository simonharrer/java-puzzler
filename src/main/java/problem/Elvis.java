package problem;

import java.util.Calendar;

/*
 * based on http://www.javapuzzlers.com/java-puzzlers-sampler.pdf 
 */
public class Elvis {
	public static final Elvis INSTANCE = new Elvis();
	private static final int CURRENT_YEAR = Calendar.getInstance().get(
			Calendar.YEAR);
	
	private final int age;

	private Elvis() {
		age = CURRENT_YEAR - 1935;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		System.out.println("Elvis is " + INSTANCE.getAge() + " years old.");

		// what does it print?
		// a) 1935
		// b) -1935
		// c) 79
		// d) 0
		// e) none of the above
	}
}