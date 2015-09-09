/****************** Exercise 6 *****************
 * Modify the previous exercise so that two of the overloaded methods have
 * two arguments (of two different types), but in reversed order relative to each other. Verify
 * that this works.
 ************************************************/

package c4_initialization_and_cleanup;

public class E06_Dog2 {
	
	public void bark() {
		System.out.println("simple Bark! ()");
	}
	
	public void bark(int i) {
		System.out.println("int Bark! ("+i+")");
	}
	
	public void bark(char c) {
		System.out.println("char Bark! ("+c+")");
	}
	
	public void bark(double d) {
		System.out.println("double Bark! ("+d+")");
	}
	
	public void bark(boolean b) {
		System.out.println("boolean Bark! ("+b+")");
	}
	
	public void bark(boolean b, int i) {
		System.out.println("boolean-int Bark! ("+b+", " +i+")");
	}
	
	public void bark(int i, boolean b) {
		System.out.println("int-boolean Bark! ("+i+", " +b+")");
	}

	public static void main(String[] args) {
		E06_Dog2 dog = new E06_Dog2();
		dog.bark();
		dog.bark(741);
		dog.bark('?');
		dog.bark(3.14);
		dog.bark(true);
		dog.bark(true, 741);
		dog.bark(741, true);

	}

}
