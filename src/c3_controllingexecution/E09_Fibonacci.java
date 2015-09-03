/****************** Exercise 9 *****************
 * A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
 * 34, and so on, where each number (from the third on) is the sum of the previous two.
 * Create a method that takes an integer as an argument and displays that many
 * Fibonacci numbers starting from the beginning, e.g., If you run
 * java Fibonacci 5 (where Fibonacci is the name of the class)
 * the output will be: 1, 1, 2, 3, 5.
 ************************************************/

package c3_controllingexecution;

public class E09_Fibonacci {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("There must be exactly one argument");
			return;
		}
		int n = Integer.parseInt(args[0]);
		if (n == 0) {
			return;
		} else if (n == 1) {
			System.out.print("1");
		} else {
			System.out.print("1, 1");
			if (n > 2){
				int a = 1;
				int b = 1;
				for (int i = 2; i < n; i++){
					b += a;
					a = b-a;
					System.out.print(", "+b);
				}
			}
		}
		System.out.println(".");

	}

}
