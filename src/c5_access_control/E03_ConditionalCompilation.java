/****************** Exercise 3 *****************
 * Create two packages: debug and debugoff, containing an identical class
 * with a debug( ) method. The first version displays its String argument to the console, the
 * second does nothing. Use a static import line to import the class into a test program, and
 * demonstrate the conditional compilation effect.
 ************************************************/

package c5_access_control;

import static c5_access_control.beyond.debug.Apply.debug;

public class E03_ConditionalCompilation {

	public static void main(String[] args) {
		debug();
	}
}
