package solution.strungout;

/*
 * from http://www.javapuzzlers.com/java-puzzlers-sampler.pdf
 */
public class StrungOut {

	// problem: main method uses our own String class
	// solution: do not use class names from classes in java.lang.*

	public static void main(String[] args) {
		MyString s = new MyString("Hello World");
		System.out.println(s);

		// what does it print?
		// AFTER a) Hello World
		// b) nothing
		// BEFORE c) none of the above
	}
}

class MyString {
	private final java.lang.String s;

	public MyString(java.lang.String s) {
		this.s = s;
	}

	public java.lang.String toString() {
		return s;
	}
}
