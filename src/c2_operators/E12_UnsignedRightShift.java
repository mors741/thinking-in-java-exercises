/****************** Exercise 12 *****************
 * Start with a number that is all binary ones.
 * Left shift it, then use the unsigned right-shift
 * operator to right shift through all of its binary
 * positions. Display each result using
 * Integer.toBinaryString().
 ************************************************/ 

package c2_operators;

public class E12_UnsignedRightShift {

	public static void main(String[] args) {
		int a = 0xffffffff;
		System.out.println(Integer.toBinaryString(a) + " = " + a);
		a <<=1;
		for (int i = 1; i < 33; i++) {
			System.out.println(Integer.toBinaryString(a) + " = " + a);
			a>>>=1;
		}
	}

}
