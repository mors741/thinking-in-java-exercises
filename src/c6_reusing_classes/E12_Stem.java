/****************** Exercise 12 *****************
 * Add a proper hierarchy of dispose( ) methods to all the classes in
 * Exercise 9.
 ************************************************/

package c6_reusing_classes;

class E12_Component1 {
	public E12_Component1() {
		System.out.println("E12_Component1()");
	}
	void dispose() {
		System.out.println("Component1 dispose");
	}
}
class E12_Component2 {
	public E12_Component2() {
		System.out.println("E12_Component2()");
	}
	void dispose() {
		System.out.println("Component2 dispose");
	}
}
class E12_Component3 {
	public E12_Component3() {
		System.out.println("E12_Component3()");
	}
	void dispose() {
		System.out.println("Component3 dispose");
	}
}

class E12_Root {
	E12_Root(int param) {
		System.out.println("E12_Root("+param+")");
	}
	E12_Component1 c1 = new E12_Component1();
	E12_Component2 c2 = new E12_Component2();
	E12_Component3 c3 = new E12_Component3();
	
	void dispose() {
		c1.dispose();
		c2.dispose();
		c3.dispose();
		System.out.println("Root dispose");
	}
}

public class E12_Stem extends E12_Root {
	public E12_Stem(int param) {
		super(param);
		System.out.println("E12_Stem("+param+")");
	}
	
	void dispose() {
		super.dispose();
		System.out.println("Stem dispose");
	}
	
	public static void main(String[] args) {
		E12_Stem x = new E12_Stem(741);
		try {
			// Code and exception handling...
		} finally {
			x.dispose();
		}

	}

}
