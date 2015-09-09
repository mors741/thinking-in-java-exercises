/****************** Exercise 9 *****************
 * Create a class with two (overloaded) constructors. Using this, call the
 * second constructor inside the first one.
 ************************************************/

package c4_initialization_and_cleanup;

enum Color {
	RED, GREEN, BLUE, GREY
}

public class E09_Pencil {
	private int regidity = 4;
	private Color color = Color.GREY;

	public E09_Pencil() {
		System.out.println("Default constructor called");
	}

	public E09_Pencil(int regidity) {
		this();
		this.regidity = regidity;
		System.out.println("Regidity is set to " + regidity);
	}

	public E09_Pencil(int regidity, Color color) {
		this(regidity);
		this.color = color;
		System.out.println("Color is set to " + color);
	}

	public String toString() {
		return color.toString() + " " + regidity;
	}

	public static void main(String[] args) {
		System.out.println(new E09_Pencil());
		System.out.println("---");
		System.out.println(new E09_Pencil(6));
		System.out.println("---");
		System.out.println(new E09_Pencil(6, Color.RED));
	}

}
