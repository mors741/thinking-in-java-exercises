/****************** Exercise 8 *****************
 * Create a base class with only a non-default constructor, and a derived
 * class with both a default (no-arg) and non-default constructor. In the derived-class
 * constructors, call the base-class constructor.
 ************************************************/

package c6_reusing_classes;

class OnlyParam {
	OnlyParam(int i) {
		System.out.println("OnlyParam("+i+")");
	}
}

public class E08_DiffConstr extends OnlyParam {
	public E08_DiffConstr() {
		super(741);
		System.out.println("E08_DiffConstr()");
	}
	
	public E08_DiffConstr(int i) {
		super(i);
		System.out.println("E08_DiffConstr("+i+")");
	}

	public static void main(String[] args) {
		new E08_DiffConstr();
		new E08_DiffConstr(800);

	}

}
