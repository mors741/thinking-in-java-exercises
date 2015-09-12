/****************** Exercise 23 *****************
 * Prove that class loading takes place only once. Prove that loading may
 * be caused by either the creation of the first instance of that class or by the access of a static
 * member.
 ************************************************/

package c6_reusing_classes;

class E23_Base {
	static int i = printInit("Base initialized");
	
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
			
}

public class E23_ClassLoading extends E23_Base {
	public void f() {};
	static int j = printInit("ClassLoading initialized");
	public static void main(String[] args) {
		

	}

}
