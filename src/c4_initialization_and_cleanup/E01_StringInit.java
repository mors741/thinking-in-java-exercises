/****************** Exercise 1 *****************
 * Create a class containing an uninitialized String reference. Demonstrate
 * that this reference is initialized by Java to null.
 ************************************************/

package c4_initialization_and_cleanup;

public class E01_StringInit {

	String str;

	public static void main(String[] args) {
		E01_StringInit a = new E01_StringInit();
		System.out.println(a.str);
	}
}
