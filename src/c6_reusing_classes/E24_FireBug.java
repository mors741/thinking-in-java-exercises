/****************** Exercise 24 *****************
 * In Beetle.java, inherit a specific type of beetle from class Beetle,
 * following the same format as the existing classes. Trace and explain the output.
 ************************************************/

package c6_reusing_classes;

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}

	@SuppressWarnings("unused")
	private static int x1 = printInit("static Insect.x1 initialized");

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");

	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}

	@SuppressWarnings("unused")
	private static int x2 = printInit("static Beetle.x2 initialized");
}

public class E24_FireBug extends Beetle {
	private int l = printInit("E24_FireBug.l initialized");

	public E24_FireBug() {
		System.out.println("l = " + l);
		System.out.println("j = " + j);
	}

	@SuppressWarnings("unused")
	private static int x3 = printInit("static E24_FireBug.x3 initialized");

	public static void main(String[] args) {
		System.out.println("E24_FireBug constructor");
		new E24_FireBug();
	}
}