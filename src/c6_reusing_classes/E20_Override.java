/****************** Exercise 20 *****************
 * Show that @Override annotation solves the problem in this section.
 ************************************************/

package c6_reusing_classes;

class E20_BaseClass {
	@SuppressWarnings("unused")
	private void a() {
		System.out.println("BaseClass.a()");
	}

	public void b() {
		System.out.println("BaseClass.b()");
	}
}

public class E20_Override extends E20_BaseClass {

	public void a() {
		System.out.println("Override.a()");
	}

	@Override
	public void b() {
		System.out.println("Override.b()");
	}

	public static void main(String[] args) {
		E20_Override o = new E20_Override();
		o.a();
		o.b();
		E20_BaseClass b = o;
		// ! b.a();
		b.b();
	}
}
