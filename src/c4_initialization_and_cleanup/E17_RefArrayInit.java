/****************** Exercise 17 *****************
 * Create a class with a constructor that takes a String argument. During
 * construction, print the argument. Create an array of object references to this class, but don’t
 * actually create objects to assign into the array. When you run the program, notice whether
 * the initialization messages from the constructor calls are printed.
 ************************************************/

package c4_initialization_and_cleanup;

class StringContainer {
	public StringContainer(String str) {
		System.out.println("StringContainer(" +str + ")");
	}
}

public class E17_RefArrayInit {

	public static void main(String[] args) {
		StringContainer[] ar = new StringContainer[10];

	}

}
