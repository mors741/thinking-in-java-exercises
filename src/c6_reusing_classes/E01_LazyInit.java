/****************** Exercise 1 *****************
 * Create a simple class. Inside a second class, define a reference to an object
 * of the first class. Use lazy initialization to instantiate this object.
 ************************************************/

package c6_reusing_classes;

class SimpleClass {
	public SimpleClass() {
		// Do huge amount of work
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class E01_LazyInit {
	
	private SimpleClass sc;
	
	public SimpleClass getSimpleClass() {
		if (sc == null) {
			sc = new SimpleClass();
			return sc;
		} else {
			return sc;
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		E01_LazyInit li = new E01_LazyInit();
		System.out.println(li.getSimpleClass());
		System.out.println(li.getSimpleClass());
		System.out.println(li.getSimpleClass());
		System.out.println(li.getSimpleClass());
		System.out.println("Finish");
	}

}
