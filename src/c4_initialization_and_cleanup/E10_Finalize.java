/****************** Exercise 10 *****************
 * Create a class with a finalize( ) method that prints a message. In
 * main( ), create an object of your class. Explain the behavior of your program.
 ************************************************/

package c4_initialization_and_cleanup;

public class E10_Finalize {
	public E10_Finalize() {
		System.out.println("Constructor called");
	}
	
	protected void finalize() {
		System.out.println("finalizer called");
	}
	
	public static void main(String[] args) {
		new E10_Finalize();
	}
}