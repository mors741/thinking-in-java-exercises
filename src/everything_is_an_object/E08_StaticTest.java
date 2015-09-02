/******************************* Exercise 8 ********************************
 * Write a program that demonstrates that, no matter how many objects
 * you create of a particular class, there is only one instance of a particular
 * static field in that class. 
 ***************************************************************************/

package everything_is_an_object;

public class E08_StaticTest {
	static int i = 47; 

	public static void main(String[] args) {
		E08_StaticTest a = new E08_StaticTest();
		E08_StaticTest b = new E08_StaticTest();
		b.i = 1;
		E08_StaticTest c = new E08_StaticTest();
		c.i = 100;
		E08_StaticTest d = new E08_StaticTest();
		d.i = -47;
		System.out.println("a.i = " + a.i);
		System.out.println("b.i = " + b.i);
		System.out.println("c.i = " + c.i);
		System.out.println("d.i = " + d.i);
		
	}

}
