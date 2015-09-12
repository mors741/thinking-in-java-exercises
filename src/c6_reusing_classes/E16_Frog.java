/****************** Exercise 16 *****************
 * Create a class called Amphibian. From this, inherit a class called
 * Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
 * Amphibian and demonstrate that all the methods still work.
 ************************************************/

package c6_reusing_classes;

class Amphibian {
	void walk(int meters) {
		System.out.println("Walked " + meters + " meters!");
	}
	void swim(int meters) {
		System.out.println("Swimmed " + meters + " meters!");
	}
}

public class E16_Frog extends Amphibian {
	void jump(int meters) {
		System.out.println("Jumped " + meters + " meters!");
	}
	
	public static void main(String[] args) {
		Amphibian a = new E16_Frog();
		a.walk(7);
		a.swim(4);
		//! a.jump(1);
		

	}

}
