/****************** Exercise 18 *****************
 * Complete the previous exercise by creating objects to attach to the array
 * of references.
 ************************************************/

package c4_initialization_and_cleanup;

public class E18_RefArrayInit2 {

	public static void main(String[] args) {
		StringContainer[] ar = new StringContainer[10];
		for (int i = 0; i < 10; i++) {
			ar[i] = new StringContainer("Str" + i);
		}

	}

}
