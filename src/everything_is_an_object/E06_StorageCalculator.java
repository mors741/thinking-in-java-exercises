/******************************* Exercise 6 ********************************
 * Write a program that includes and calls the storage( ) method defined
 * as a code fragment in this chapter. 
 ***************************************************************************/

package everything_is_an_object;

public class E06_StorageCalculator {
	
	int storage(String s) {
		return s.length() * 2;
	}
 
	public static void main(String[] args) {
		E06_StorageCalculator calc = new E06_StorageCalculator();
		System.out.println(calc.storage("Hello, world!"));

	}

}
