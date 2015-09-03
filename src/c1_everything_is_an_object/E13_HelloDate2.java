/******************************* Exercise 13 ********************************
 * Find the code for the second version of HelloDate.java, which is the
 * simple comment documentation example. Execute Javadoc on the file and view the results
 * with your Web browser. 
 ***************************************************************************/

package c1_everything_is_an_object;
import java.util.Date;

/**
 * <pre>Text in the "pre" tag</pre>
 * 
 * @author Evgeny Kharitonov
 * @author mors741
 * @version 1.0
 */
public class E13_HelloDate2 {
	/**
	 * Some field.
	 * "em" tag examle
	 * <em>even</em>
	 */
	public int i;
	
	/**
	 * Some method
	 * List example:
	 * <ol>
	 * <li> Item one
	 * <li> Item two
	 * <li> Item three
	 * </ol>
	 */
	public void foo() {
		
	}
	/**
	 * Entry point to class and application.
	 * 
	 * @param args
	 *            array of string arguments
	 */
	public static void main(String[] args) {
		System.out.println("Hello, it’s: ");
		System.out.println(new Date());
	}
}