/****************** Exercise 9 *****************
 * Create the following file in the c5_access_control/beyond directory (presumably in
 * your CLASSPATH):
 * <code>...</code>
 * Then create the following file in a directory other than c5_access_control/beyond:
 * <code>...</code>
 * Explain why the compiler generates an error. Would making the Foreign class part of the
 * access.local package change anything?
 ************************************************/

package c5_access_control;

import c5_access_control.beyond.*;

@SuppressWarnings("unused")
public class E09_ForeignClass {

	public static void main(String[] args) {
		// Class PackagedClass has "package" access modifier
		// so it is invisible for this class
		//! PackagedClass pc = new PackagedClass();
		
		// Making the Foreign class part of the
		// c5_access_control/beyond package would fix it.

	}

}
