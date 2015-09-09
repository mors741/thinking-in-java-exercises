/****************** Exercise 5 *****************
 * Create a class called Dog with an overloaded bark( ) method. This
 * method should be overloaded based on various primitive data types, and print different types
 * of barking, howling, etc., depending on which overloaded version is called. Write a main( )
 * that calls all the different versions.
 ************************************************/

package c4_initialization_and_cleanup;

public class E05_Dog {
	
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

	public static void main(String[] args) {
		E05_Dog dog = new E05_Dog();
		dog.bark();
		dog.bark(5);
		dog.bark('?');
		dog.bark(3.14);
		dog.bark(true);

	}

}
