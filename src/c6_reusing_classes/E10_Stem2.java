/****************** Exercise 10 *****************
 * Modify the previous exercise so that each class only has non-default
 * constructors.
 ************************************************/

package c6_reusing_classes;

class Root2 {
	Root2(int param) {
		System.out.println("Root2("+param+")");
	}
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	
}

public class E10_Stem2 extends Root2 {
	public E10_Stem2(int param) {
		super(param);
		System.out.println("E09_Stem("+param+")");
	}
	public static void main(String[] args) {
		new E10_Stem2(741);

	}

}
