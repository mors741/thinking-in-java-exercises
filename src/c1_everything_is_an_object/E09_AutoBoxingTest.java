/******************************* Exercise 9 ********************************
 * Write a program that demonstrates that autoboxing works for all the
 * primitive types and their wrappers. 
 ***************************************************************************/

package c1_everything_is_an_object;

public class E09_AutoBoxingTest {

	public static void main(String[] args) {
		Integer I = 1000;
		int i = I;
		System.out.println ("int = " +i);
		
		Byte By = 100;
		byte by = By;
		System.out.println ("byte = " +by);
		
		Short Sh = 1000;
		short sh = Sh;
		System.out.println ("short = " +sh);
		
		Long L = 10000001L;
		long l = L;
		System.out.println ("long = " +l);
		
		Boolean Bo = true;
		boolean bo = Bo;
		System.out.println ("bool = " + bo);
		
		Character Ch = 'a';
		char ch = Ch;
		System.out.println ("char = " + ch);
		
		Float F = 1000.0f;
		float f = F;
		System.out.println ("float = " +f);
		
		Double D = 1000.9999d;
		double d = D;
		System.out.println ("double = " +D);
	}

}
