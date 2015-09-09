/****************** Exercise 4 *****************
 * Add an overloaded constructor to the previous exercise that takes a
 * String argument and prints it along with your message.
 ************************************************/

package c4_initialization_and_cleanup;

public class E04_OverloadedConstrunctor {

	public E04_OverloadedConstrunctor() {
		System.out.println("E04_OverloadedConstrunctor constructed!");
	}
	
	public E04_OverloadedConstrunctor(String s) {
		System.out.printf("E04_OverloadedConstrunctor constructed! (s = \"%s\")", s );
	}

	public static void main(String[] args) {
		new E04_OverloadedConstrunctor();
		new E04_OverloadedConstrunctor("Simpsons");
	}

}
