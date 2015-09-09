/****************** Exercise 14 *****************
 * Create a class with a static String field that is initialized at the point of
 * definition, and another one that is initialized by the static block. Add a static method that
 * prints both fields and demonstrates that they are both initialized before they are used.
 ************************************************/

package c4_initialization_and_cleanup;

public class E14_StaticDef {
	public static void showAB() {
		System.out.println(a);
		System.out.println(b);
	}
	private static String a = "Definition";
	private static String b;
	static {
		b = "Static block";
	}

	public static void main(String[] args) {
		showAB();

	}

}
