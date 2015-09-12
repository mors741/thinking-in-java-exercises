/****************** Exercise 19 *****************
 * Create a class with a blank final reference to an object. Perform the
 * initialization of the blank final inside all constructors. Demonstrate the guarantee that the
 * final must be initialized before use, and that it cannot be changed once initialized.
 ************************************************/

package c6_reusing_classes;

public class E19_BlankFinal {
	public final String blank;

	public E19_BlankFinal() {
		blank = "Can't change it now!";
	}

	public E19_BlankFinal(String inVal) {
		blank = inVal;
	}

	public static void main(String[] args) {
		E19_BlankFinal bf = new E19_BlankFinal();
		// ! bf.blank = "New value";
		System.out.println(bf.blank);

	}

}
