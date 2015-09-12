/****************** Exercise 17 *****************
 * Modify Exercise 16 so that Frog overrides the method definitions from
 * the base class (provides new definitions using the same method signatures). Note what
 * happens in main( ).
 ************************************************/

package c6_reusing_classes;

public class E17_Frog2 extends Amphibian {
	void jump(int meters) {
		System.out.println("Jumped " + meters + " meters!");
	}
	
	void swim(int meters) {
		System.out.println("Breaststroke swimmed " + meters + " meters!");
	}
	
	public static void main(String[] args) {
		Amphibian a = new E17_Frog2();
		a.walk(7);
		a.swim(4);
		//! a.jump(1);
		

	}

}
