/****************** Exercise 10 *****************
 * A vampire number has an even number of digits and is formed by
 * multiplying a pair of numbers containing half the number of digits of the result. The digits
 * are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
 * Examples include:
 * 	1260 = 21 * 60
 * 	1827 = 21 * 87
 * 	2187 = 27 * 81
 * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 ************************************************/

package c3_controlling_execution;

public class E10_VampireNumbers {
	private static void checkVampire(int n) {
		int a = n / 1000;
		int b = (n / 100) % 10;
		int c = (n / 10) % 10;
		int d = n % 10;
		
		if (n == (a*10 + b) * (c*10 + d)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (a*10 + b) * (d*10 + c)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (a*10 + c) * (b*10 + d)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (a*10 + c) * (d*10 + b)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (a*10 + d) * (c*10 + b)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (a*10 + d) * (b*10 + c)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		
		if (n == (b*10 + a) * (c*10 + d)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (b*10 + a) * (d*10 + c)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (b*10 + c) * (d*10 + a)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (b*10 + d) * (c*10 + a)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		
		if (n == (c*10 + a) * (d*10 + b)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		if (n == (c*10 + b) * (d*10 + a)) { System.out.println(n + " =  " + a + "" + b + " * " + c + "" + d); return; }
		
	}

	public static void main(String[] args) {
		for (int i = 1000; i<10000; i++) {
			checkVampire(i);
		}
	}

}
