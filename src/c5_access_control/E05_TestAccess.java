/****************** Exercise 5 *****************
 * Create a class with public, private, protected, and package-access
 * fields and method members. Create an object of this class and see what kind of compiler
 * messages you get when you try to access all the class members. Be aware that classes in the
 * same directory are part of the “default” package.
 ************************************************/

package c5_access_control;

class Test {
	public int publ;
	protected int prot;
	int pack;
	@SuppressWarnings("unused")
	private int priv;
	
	public int publMethod(){return 1;};
	protected int protMethod(){return 1;};
	int packMethod(){return 1;};
	@SuppressWarnings("unused")
	private int privMethod(){return 1;};
	
	
}

public class E05_TestAccess {

	public static void main(String[] args) {
		Test test = new Test();
		test.publ = 3;
		test.prot = 3;
		test.pack = 3;
		//!test.priv = 3;
		
		test.publMethod();
		test.protMethod();
		test.packMethod();
		//!test.privMethod();

	}

}
