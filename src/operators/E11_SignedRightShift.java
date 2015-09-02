/****************** Exercise 11 *****************
 * Start with a number that has a binary one in
 * the most significant position. (Hint: Use a
 * hexadecimal constant.) Use the signed
 * right-shift operator to right shift your
 * number through all its binary positions.
 * Display each result using Integer.toBinaryString().
 ************************************************/ 

package operators;

public class E11_SignedRightShift {

	public static void main(String[] args) {
		int a = 0x80000000;
		System.out.println(Integer.toBinaryString(a) + " = " + a);
		for (int i = 1; i < 32; i++) {
			a>>=1;
			System.out.println(Integer.toBinaryString(a) + " = " + a);
		}

	}

}
