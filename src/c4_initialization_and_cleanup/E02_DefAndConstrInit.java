/****************** Exercise 2 *****************
 * Create a class with a String field that is initialized at the point of
 * definition, and another one that is initialized by the constructor. What is the difference
 * between the two approaches?
 ************************************************/

package c4_initialization_and_cleanup;

class DefInit {
	String s = "Rick and Morty";
}

class ConstrInit {
	String s;
	ConstrInit() {
		s = "Adventure Time";
	}
}

public class E02_DefAndConstrInit {

	public static void main(String[] args) {
		System.out.println(new DefInit().s);
		System.out.println(new ConstrInit().s);
		System.out.println("1. In DefInit s is assigned to value before the constructor call.");
		System.out.println("2. In ConstrInit s is first assigned to null. Then to it's value.");

	}

}
