/****************** Exercise 7 *****************
 * Modify Exercise 1 so that the program exits by using the break keyword
 * at value 99. Try using return instead.
 ************************************************/

package c3_controlling_execution;

public class E07_BreakTest {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
			if (i == 99) {
				//System.out.println("break");
				//break;
				System.out.println("return");
				return;
			}
		}
	}
}