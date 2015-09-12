/****************** Exercise 18 *****************
 * Create a class with a static final field and a final field and
 * demonstrate the difference between the two.
 ************************************************/

package c6_reusing_classes;

import java.util.Random;

public class E18_StaticFinal {
	private static Random rand = new Random(741);
	public static final int ST_FIN = rand.nextInt(100);
	public final int fin = rand.nextInt(100);

	public String toString() {
		return "ST_FIN = " + ST_FIN + ", fin = " + fin;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(new E18_StaticFinal());
		}
	}
}
