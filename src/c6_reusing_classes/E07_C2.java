/****************** Exercise 7 *****************
 * Modify Exercise 5 so that A and B have constructors with arguments
 * instead of default constructors. Write a constructor for C and perform all initialization within
 * C’s constructor.
 ************************************************/

package c6_reusing_classes;

class A2 {
	A2(int i){
		System.out.println("A2("+ i +")");
	}
}

class B2 {
	B2(int i){
		System.out.println("B2("+ i +")");
	}
}

public class E07_C2 extends A2 {
	E07_C2() {
		super(778);
	}
	@SuppressWarnings("unused")
	private B2 b = new B2(741);
	public static void main(String[] args) {
		new E07_C2();

	}

}
