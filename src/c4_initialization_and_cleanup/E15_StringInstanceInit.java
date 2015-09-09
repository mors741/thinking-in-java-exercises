/****************** Exercise 15 *****************
 * Create a class with a String that is initialized using instance
 * initialization.
 ************************************************/

package c4_initialization_and_cleanup;

public class E15_StringInstanceInit {
	public String a;
	{
		a = "Instance initialization";
	}

	public static void main(String[] args) {
		System.out.println(new E15_StringInstanceInit().a);

	}

}
