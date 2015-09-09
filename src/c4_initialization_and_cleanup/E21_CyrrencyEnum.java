/****************** Exercise 21 *****************
 * Create an enum of the least-valuable six types of paper currency. Loop
 * through the values( ) and print each value and its ordinal( ).
 ************************************************/

package c4_initialization_and_cleanup;

enum Currency {
	ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class E21_CyrrencyEnum {

	public static void main(String[] args) {
		for (Currency cur : Currency.values()) {
			System.out.println(cur + " " + cur.ordinal());
		}

	}

}
