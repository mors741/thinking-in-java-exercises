/******************************* Exercise 3 ********************************
 * Create a class containing a float and use it to demonstrate aliasing
 * during method calls. 
 ***************************************************************************/

package c2_operators;

class Woman {
	float weight;
	Woman(float weight) {
		this.weight = weight;
	}
}

public class E03_MethodAliasing {
	
	public static void giveFood(Woman w) {
		w.weight += 1.0f;
	}

	public static void main(String[] args) {
		Woman hanna = new Woman(60.0f);
		System.out.println("Before: " + hanna.weight);
		giveFood(hanna);
		System.out.println("After: " + hanna.weight);

	}

}
