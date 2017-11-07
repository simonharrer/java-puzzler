package problem;

import java.util.Calendar;

public class DatingGame {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, 12, 31); // Year, Month, Day
		System.out.print(cal.get(Calendar.YEAR));

		// what does it print?
		// a) 1999
		// b) 2000
		// c) none of the above
	}
}
