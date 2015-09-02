/****************** Exercise 14 *****************
 * Write a method that compares two String arguments
 * using all the Boolean comparisons and print the
 * results. Perform the equals() test for the == and
 * !=. In main(), call your method with different
 * String objects.
 ************************************************/ 
package operators;

public class E14_CompareStrings {
	private static void print(String m, boolean b) {
		System.out.println(m + " = " + b);
	}
	
	public static void compare(String a, String b) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		print("a==b",a==b);
		print("a!=b",a!=b);
		//print("a>b",a>b);
		print("a.equals(b)",a.equals(b));
		System.out.println("**************");
	}

	public static void main(String[] args) {
		 compare("Hello", "Hello");
		 // Force creation of separate object:
		 String s = new String("Hello");
		 compare("Hello", s);
		 compare("Hello", "Goodbye"); 
	}

}
