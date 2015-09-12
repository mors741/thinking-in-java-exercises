/****************** Exercise 2 *****************
 * Inherit a new class from class Detergent. Override scrub( ) and add a
 * new method called sterilize( ).
 ************************************************/

package c6_reusing_classes;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	public String toString() {
		return s;
	}
}

class Detergent extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}
	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}
}

public class E02_MrMuscle extends Detergent {
	
	public void scrub() {
		append(" E02_MrMuscle.scrub()");
		super.scrub(); // Call base-class version
	}
	
	public void sterilize() {
		append(" E02_MrMuscle.sterilize()");
	}
	
	public static void main(String[] args) {
		Cleanser cl = new Cleanser();
		cl.apply();
		cl.dilute();
		cl.scrub();
		System.out.println(cl);
		
		Detergent dt = new Detergent();
		dt.foam();
		dt.scrub();
		System.out.println(dt);
		
		E02_MrMuscle mm = new E02_MrMuscle();
		mm.foam();
		mm.scrub();
		mm.sterilize();
		mm.apply();
		mm.dilute();
		System.out.println(mm);
		
	}

}
