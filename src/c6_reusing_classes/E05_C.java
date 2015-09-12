/****************** Exercise 5 *****************
 * Create two classes, A and B, with default constructors (empty argument
 * lists) that announce themselves. Inherit a new class called C from A, and create a member of
 * class B inside C. Do not create a constructor for C. Create an object of class C and observe
 * the results.
 ************************************************/

package c6_reusing_classes;

class A {
	A(){
		System.out.println("A()");
	}
}

class B {
	B(){
		System.out.println("B()");
	}
}

public class E05_C extends A {
	@SuppressWarnings("unused")
	private B b = new B();
	public static void main(String[] args) {
		new E05_C();

	}

}
