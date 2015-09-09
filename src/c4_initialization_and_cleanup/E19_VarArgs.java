/****************** Exercise 19 *****************
 * Write a method that takes a vararg String array. Verify that you can
 * pass either a comma-separated list of Strings or a String[] into this method.
 ************************************************/

package c4_initialization_and_cleanup;

public class E19_VarArgs {

	public static void print(String... args) {
		for (String s : args) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		print("Apple","Orange","Peach", "Strawberry","Banana");
		System.out.println("---------");
		print(new String[] {"Apple","Orange","Peach", "Strawberry","Banana"});

	}

}
