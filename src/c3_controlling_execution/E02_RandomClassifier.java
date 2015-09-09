/****************** Exercise 2 *****************
 * Write a program that generates 25 random int values. For each value,
 * use an if-else statement to classify it as greater than, less than, or equal to a second
 * randomly generated value.
 ************************************************/ 

package c3_controlling_execution;

import java.util.Random;

public class E02_RandomClassifier {

	public static void main(String[] args) {
		Random rnd = new Random();
		int a = rnd.nextInt();
		for (int i = 0; i < 25; i++) {
			int b;
			if (i == 1){
				b = a;
			} else {
				b = rnd.nextInt();
			} 
			if (b < a) {
				System.out.println(b + " < " + a);
			} else if (b > a) {
				System.out.println(b + " > " + a);
			} else {
				System.out.println(b + " == " + a);
			}
		}
	}
}
