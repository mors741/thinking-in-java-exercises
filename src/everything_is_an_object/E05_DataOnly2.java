/******************************* Exercise 5 ********************************
 * Modify the previous exercise so that the values of the data in DataOnly
 * are assigned to and printed in main( ). 
 ***************************************************************************/
package everything_is_an_object;

public class E05_DataOnly2 {
	int i;
	double d;
	boolean b;

	public static void main(String[] args) {
		E05_DataOnly2 data = new E05_DataOnly2();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		System.out.println("i = " + data.i);
		System.out.println("d = " + data.d);
		System.out.println("b = " + data.b);
	}
}