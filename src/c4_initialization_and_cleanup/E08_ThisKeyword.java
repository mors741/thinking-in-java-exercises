/****************** Exercise 8 *****************
 * Create a class with two methods. Within the first method, call the second
 * method twice: the first time without using this, and the second time using this—just to see it
 * working; you should not use this form in practice.
 ************************************************/

package c4_initialization_and_cleanup;

public class E08_ThisKeyword {
	
	public void bar() {
		foo();
		this.foo();
	}
	
	private void foo() {
		System.out.println("foo()");
	}

	public static void main(String[] args) {
		E08_ThisKeyword test = new E08_ThisKeyword();
		test.bar();
	}

}
