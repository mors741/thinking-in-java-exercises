/****************** Exercise 20 *****************
 * Create a main( ) that uses varargs instead of the ordinary main( )
 * syntax. Print all the elements in the resulting args array. Test it with various numbers of
 * command-line arguments.
 ************************************************/

package c4_initialization_and_cleanup;

public class E20_DefferentMain {

	public static void main(String... args) {
		for (String s : args) {
			System.out.println(s);
		}

	}

}
