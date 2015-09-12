/****************** Exercise 3 *****************
 * Prove the next sentence.
 * 
 * "You can see that the construction happens from the base “outward,” so the base class is
 * initialized before the derived-class constructors can access it. Even if you don’t create a
 * constructor for Cartoon( ), the compiler will synthesize a default constructor for you that
 * calls the base class constructor."
 ************************************************/

package c6_reusing_classes;

class WithoutConstructor {
}

public class E03_SyntheticConstructor extends WithoutConstructor {
	public E03_SyntheticConstructor() {
		super();
		System.out.println("E03_SyntheticConstructor()");
	}

	public static void main(String[] args) {
		new E03_SyntheticConstructor();
	}
}
