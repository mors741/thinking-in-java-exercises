/****************** Exercise 16 *****************
 * Create an array of String objects and assign a String to each element.
 * Print the array by using a for loop.
 ************************************************/

package c4_initialization_and_cleanup;

public class E16_StringArray {

	public static void main(String[] args) {
		String[] ar = {"First", "Second", "Third", "Fourth"};
		for (String str : ar){
			System.out.println(str);
		}

	}

}
