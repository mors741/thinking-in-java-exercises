/****************** Exercise 1 *****************
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 ************************************************/

/****************** Exercise 5 *****************
 * Starting from Exercise 1, add a wheels( ) method in Cycle, which
 * returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
 * polymorphism works.
 ************************************************/

package c7_polymorphism;

class Cycle {
	int wheels() {
		return 0;
	}
	
}

class Unicycle extends Cycle {
	int wheels() {
		return 1;
	}
}

class Bicycle extends Cycle {
	int wheels() {
		return 2;
	}
}

class Tricycle extends Cycle {
	int wheels() {
		return 3;
	}
}

public class E01_05_Rider {
	
	public static void ride(Cycle c) {
		System.out.println("Yeppy, I'm riding a " + c.getClass().getSimpleName() +
				"! I has " + c.wheels() + " wheels!");
	}

	public static void main(String[] args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());

	}

}
