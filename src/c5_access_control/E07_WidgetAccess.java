/****************** Exercise 7 *****************
 * Create the library according to the code fragments describing access and
 * Widget. Create a Widget in a class that is not part of the access package.
 ************************************************/

package c5_access_control;

import c5_access_control.beyond.access.Widget;

public class E07_WidgetAccess {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Widget w = new Widget();

	}

}
