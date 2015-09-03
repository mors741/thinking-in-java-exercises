/****************** Exercise 7 *****************
 * Write a program that simulates coin-flipping.
 ***********************************************/ 

package c2_operators;

import java.util.Random;

public class E07_CoinFlipper {

	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println(rnd.nextBoolean() ? "head" : "tail");

	}

}
