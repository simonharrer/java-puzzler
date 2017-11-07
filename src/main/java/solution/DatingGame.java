package solution;

import java.util.Calendar;

public class DatingGame {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		// problem: 0 is January, 1 is February, 12 is January of the next year
		// solution: use static field, or use new Java 8 date api!

		cal.set(1999, Calendar.DECEMBER, 31); // Year, Month, Day
		System.out.print(cal.get(Calendar.YEAR));

		// what does it print?
		// AFTER a) 1999
		// BEFORE b) 2000
		// c) none of the above
	}
}
