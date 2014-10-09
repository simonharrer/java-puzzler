package problem.strungout;

/*
 * from http://www.javapuzzlers.com/java-puzzlers-sampler.pdf
 */
public class StrungOut {
	public static void main(String[] args) {
		String s = new String("Hello World");
		System.out.println(s);
		
		// what does it print?
		// a) Hello World
		// b) nothing
		// c) none of the above
	}
}

class String {
	private final java.lang.String s;

	public String(java.lang.String s) {
		this.s = s;
	}

	public java.lang.String toString() {
		return s;
	}
}
