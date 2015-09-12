/****************** Exercise 9 *****************
 * Create a class called Root that contains an instance of each of the classes
 * (that you also create) named Component1, Component2, and Component3. Derive a
 * class Stem from Root that also contains an instance of each “component.” All classes should
 * have default constructors that print a message about that class.
 ************************************************/

package c6_reusing_classes;

class Component1 {
	public Component1() {
		System.out.println("Component1()");
	}
}
class Component2 {
	public Component2() {
		System.out.println("Component2()");
	}
}
class Component3 {
	public Component3() {
		System.out.println("Component3()");
	}
}

class Root {
	Root() {
		System.out.println("Root()");
	}
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	
}

public class E09_Stem extends Root {
	public E09_Stem() {
		System.out.println("E09_Stem()");
	}
	public static void main(String[] args) {
		new E09_Stem();

	}

}
