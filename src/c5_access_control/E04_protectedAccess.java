/****************** Exercise 4 *****************
 * Show that protected methods have package access but are not public.
 ************************************************/

package c5_access_control;

import c5_access_control.beyond.DummyClass;

@SuppressWarnings("unused")
class Prot {
	protected void protectedMethod() {};
}

public class E04_protectedAccess {
	public static void main(String[] args) {
		// Package access
		new Prot().protectedMethod();
		// But not public
		//! DummyClass.protectedMethod();
	}
}
