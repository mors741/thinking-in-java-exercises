/******************************* Exercise 12 ********************************
 * Find the code for the second version of HelloDate.java, which is the
 * simple comment documentation example. Execute Javadoc on the file and view the results
 * with your Web browser. 
 ***************************************************************************/

package c1_everything_is_an_object;
import java.util.Date;

/**
 * The first Thinking in Java example program. Displays a string and today’s
 * date.
 * 
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class E12_HelloDate {
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