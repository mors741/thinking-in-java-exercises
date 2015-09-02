/****************** Exercise 8 *****************
 * Show that hex and octal notations work with long
 * values. Use Long.toBinaryString() to display
 * the results.
 ***********************************************/ 

package operators;

public class E08_HexAndOctLong {

	public static void main(String[] args) {
		long l = 0xF;
		System.out.println(Long.toBinaryString(l));
		l = 0xFFF;
		System.out.println(Long.toBinaryString(l));
		l = 017;
		System.out.println(Long.toBinaryString(l));
		l = 0xF;
		System.out.println(Long.toOctalString(l));
		l = 0xFFF;
		System.out.println(Long.toHexString(l));
	}
}
