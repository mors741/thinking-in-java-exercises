/****************** Exercise 6 *****************
 * Using Chess.java, prove this statement:
 * 
 * If you don’t call the base-class constructor in BoardGame( ), the compiler will complain
 * that it can’t find a constructor of the form Game( ). In addition, the call to the base-class
 * constructor must be the first thing you do in the derived-class constructor. (The compiler will
 * remind you if you get it wrong.)
 ************************************************/

package c6_reusing_classes;

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

public class E06_Chess extends BoardGame {
	E06_Chess() {
		// super(11)
		// Implicit super constructor BoardGame() is undefined. Must explicitly invoke another constructor
		super(11);
		System.out.println("Chess constructor");
		
		//! super(11);
		// Constructor call must be the first statement in a constructor
	}

	public static void main(String[] args) {
		new E06_Chess();
	}
}
