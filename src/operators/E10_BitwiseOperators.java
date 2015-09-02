/****************** Exercise 10 *****************
 * Write a program with two constant values, one
 * with alternating binary ones and zeroes, with
 * a zero in the least-significant digit, and the
 * second, also alternating, with a one in the
 * least-significant digit. (Hint: It's easiest to
 * use hexadecimal constants for this.) Combine
 * these two values every way possible using the
 * bitwise operators. Display the results using
 * Integer.toBinaryString().
 ************************************************/ 

package operators;

public class E10_BitwiseOperators {
	private static void printBinary(String message, int a) {
		System.out.println(message + " = " +Integer.toBinaryString(a));
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
