/****************** Exercise 13 *****************
 * Write a method to display char values in
 * binary form. Demonstrate it using several
 * different characters.
 ************************************************/ 

package c2_operators;

public class E13_BinaryChar {
	public static void main(String[] args) {
		int ch = 'a';
		for (int i = 0; i < 26; i++){
			System.out.println((char)ch + " = " + Integer.toBinaryString(ch++));
		}
	}

}
