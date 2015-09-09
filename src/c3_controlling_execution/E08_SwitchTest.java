/****************** Exercise 8 *****************
 * Create a switch statement that prints a message for each case, and put
 * the switch inside a for loop that tries each case. Put a break after each case and test it,
 * then remove the breaks and see what happens.
 ************************************************/

package c3_controlling_execution;

public class E08_SwitchTest {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " divides by: ");
			switch (i) {
			case 2:
			case 4:
			case 8:
			case 10:
				System.out.print(2);
				break;
			case 3:
			case 9:
				System.out.print(3);
				break;
			case 6:
				System.out.print(2 + ", " + 3);
			}
			System.out.println();

		}

	}

}
