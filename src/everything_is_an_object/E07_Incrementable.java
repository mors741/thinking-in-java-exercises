/******************************* Exercise 7 ********************************
 * Turn the Incrementable code fragments into a working program. 
 ***************************************************************************/

package everything_is_an_object;

class StaticTest {
	static int i = 47;
}

public class E07_Incrementable {

	static void increment() { StaticTest.i++; }

	public static void main(String[] args) {
		E07_Incrementable.increment();

	}

}
