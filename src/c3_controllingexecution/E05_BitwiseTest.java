/****************** Exercise 5 *****************
 * Repeat Exercise 10 from the previous chapter, using the ternary operator
 * and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
 ************************************************/ 

package c3_controllingexecution;

public class E05_BitwiseTest {
	
	private static String bitwiseTest(int a) {
		StringBuilder sb = new StringBuilder(32);
		int tester = 0x80000000;
		for (int i = 0; i < 32; i++) {
			sb.append((a&tester) == tester ? 1 : 0);
			//System.out.println(Integer.toBinaryString(tester));
			tester >>>=1;

		}
		return sb.toString();
	}
	
	private static void printBinary(String message, int a) {
		System.out.println(message + " = " +bitwiseTest(a));
	}

	public static void main(String[] args) {
		int a = 0b10101010101010101010101010101010;
		int b = 0b01010101010101010101010101010101;
		printBinary("a", a);
		printBinary("b", b);
		printBinary("~a", ~a);
		printBinary("a&a", a&a);
		printBinary("a|a", a|a);
		printBinary("a^a", a^a);
		printBinary("a&b", a&b);
		printBinary("a|b", a|b);
		printBinary("a^b", a^b);

	}

}
