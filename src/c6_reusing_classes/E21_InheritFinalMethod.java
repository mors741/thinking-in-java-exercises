/****************** Exercise 21 *****************
 * Create a class with a final method. Inherit from that class and attempt
 * to overwrite that method.
 ************************************************/

package c6_reusing_classes;

class FinalMethod {
	public final void f() {}
}

public class E21_InheritFinalMethod extends FinalMethod {
	// Cannot override the final method from FinalMethod
	//! public void f() {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
