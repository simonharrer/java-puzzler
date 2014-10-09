package solution;

import java.util.*;

/*
 * based on http://www.javapuzzlers.com/java-puzzlers-sampler.pdf 
 */
public class Name {
	private final String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name n = (Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}

	public static void main(String[] args) {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Mickey", "Mouse"));
		System.out.println(s.contains(new Name("Mickey", "Mouse")));

		// problem: hashCode and equals have always be overridden together
		// solution: provide a compatible hashCode implementation

		// what does it print?
		// AFTER a) true
		// BEFORE b) false
		// c) none of the above
	}
}