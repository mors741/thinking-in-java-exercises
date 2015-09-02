/******************************* Exercise 2 ********************************
 * Create a class containing a float and use it to demonstrate aliasing.
 ***************************************************************************/

package operators;

class Fish {
	float weight;
	Fish(float weight) {
		this.weight = weight;
	}
}

public class E02_AliasingExample {

	public static void main(String[] args) {
		Fish fish1 = new Fish(3.5f);
		Fish fish2 = fish1;
		fish2.weight = 2.0f;
		System.out.println(fish1.weight);

	}

}
