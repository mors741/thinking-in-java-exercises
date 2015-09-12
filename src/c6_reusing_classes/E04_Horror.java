/****************** Exercise 4 *****************
 * Prove that the base-class constructors are (a) always called and (b) called
 * before derived-class constructors.
 ************************************************/

package c6_reusing_classes;

class Movie {
	Movie() {
		System.out.println("Movie constructor");
	}
}

public class E04_Horror extends Movie {
	
	public E04_Horror() {
		System.out.println("Horror constructor");
	}

	public static void main(String[] args) {
		new E04_Horror();

	}

}
