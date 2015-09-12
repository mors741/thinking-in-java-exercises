/****************** Exercise 11 *****************
 * Modify Detergent.java so that it uses delegation.
 ************************************************/

package c6_reusing_classes;

public class E11_Detergent {
	
	private Cleanser cl;
	
	public E11_Detergent(Cleanser cl) {
		this.cl = cl;
	}
	
	public void append(String a) {
		cl.append(a);
	}
	
	public void scrub() {
		cl.scrub();
		append(" Detergent.scrub()");
	}

	public void foam() {
		append(" foam()");
	}
	
	public void dilute() {
		cl.dilute();
	}
	public void apply() {
		cl.apply();
	}
	
	public String toString() {
		return cl.toString();
	}

	public static void main(String[] args) {
		E11_Detergent det = new E11_Detergent(new Cleanser());
		det.dilute();
		det.foam();
		det.scrub();
		det.apply();
		System.out.println(det);

	}

}
