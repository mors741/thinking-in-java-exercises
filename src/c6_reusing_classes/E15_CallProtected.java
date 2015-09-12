/****************** Exercise 15 *****************
 * Create a class inside a package. Your class should contain a protected
 * method. Outside of the package, try to call the protected method and explain the results.
 * Now inherit from your class and call the protected method from inside a method of your
 * derived class.
 ************************************************/

package c6_reusing_classes;

import c6_reusing_classes.beyond.Phone;

class SmartPhone extends Phone {
	public void browseNet() {

	}

	public void newContact(String name, String number) {
		addContact(name, number);
		// Do other stuff
	}
}

public class E15_CallProtected {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Phone p = new Phone();
		SmartPhone s = new SmartPhone();
		// ! p.addContact("mors741", "+7 (916) 427-426-4");
		s.newContact("mors741", "+7 (916) 427-426-4");

	}

}
