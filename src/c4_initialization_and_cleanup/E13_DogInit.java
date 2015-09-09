/****************** Exercise 13 *****************
 * Verify the statements in the previous paragraph.
 ************************************************/

package c4_initialization_and_cleanup;

class Leg {
	int marker;
	Leg(int marker) {
		this.marker = marker;
		System.out.println("Leg("+marker+")");
	}
	public String toString() {
		return "Leg("+marker+")";
	}
}
@SuppressWarnings("unused")
public class E13_DogInit {
	public static Leg leg1 = new Leg(1);
	private Leg leg2 = new Leg(2);
	private Leg leg3;
	Leg leg4;
	
	public E13_DogInit() {
		System.out.println("Constructor started");
		leg3 = new Leg(3);
		leg4 = new Leg(4);
	}

	public static void main(String[] args) {
		System.out.println("Creating new instance");
		new E13_DogInit();

	}

}
