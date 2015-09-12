/****************** Exercise 13 *****************
 * Create a class with a method that is overloaded three times. Inherit a
 * new class, add a new overloading of the method, and show that all four methods are available
 * in the derived class.
 ************************************************/

package c6_reusing_classes;

class ThreeMethods {
	void method() {
		System.out.println("method()");
	}
	void method(int i) {
		System.out.println("method("+i+")");
	}
	void method(boolean b) {
		System.out.println("method("+b+")");
	}
}

public class E13_OverloadInherited extends ThreeMethods {
	void method(char c) {
		System.out.println("method("+c+")");
	}
	public static void main(String[] args) {
		E13_OverloadInherited a = new E13_OverloadInherited();
		a.method();
		a.method(3);
		a.method(true);
		a.method('c');
	}

}
