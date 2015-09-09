/****************** Exercise 3 *****************
 * Create a class with a default constructor (one that takes no arguments)
 * that prints a message. Create an object of this class.
 ************************************************/

package c4_initialization_and_cleanup;

public class E03_DefaultConstructor {
	
	public E03_DefaultConstructor() {
		System.out.println("E03_DefaultConstructor constructed!");
	}

	public static void main(String[] args) {
		new E03_DefaultConstructor();
	}
}
