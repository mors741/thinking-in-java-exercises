/****************** Exercise 3 *****************
 * Modify Exercise 2 so that your code is surrounded by an “infinite” while
 * loop. It will then run until you interrupt it from the keyboard
 * (typically by pressing Control-C).
 ************************************************/ 

package c3_controlling_execution;

import java.util.Random;

public class E03_InfiniteRandomClassifier {

	public static void main(String[] args) {
		Random rnd = new Random();
		int a = rnd.nextInt();
		int i = 0;
		while (true){
			int b;
			if (i == 1){
				b = a;
			} else {
				b = rnd.nextInt();
			} 
			if (b < a) {
				System.out.println(i+") "+b + " < " + a);
			} else if (b > a) {
				System.out.println(i+") "+b + " > " + a);
			} else {
				System.out.println(i+") "+b + " == " + a);
			}
			i++;
		}
	}

}
