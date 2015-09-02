/****************** Exercise 6 *****************
 * Following Exercise 5 assign, a new Dog
 * reference to spot's object. Test for comparison
 * using == and equals() for all references.
 ***********************************************/ 

package operators;

public class E06_Dogs2 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("spot", "Ruff!");
		Dog dog2 = new Dog("spot", "Ruff!");
		Dog dog3 = dog1;
		System.out.println("dog1 == dog2 -> " + (dog1 == dog2));
		System.out.println("dog2 == dog3 -> " + (dog2 == dog3));
		System.out.println("dog1 == dog3 -> " + (dog1 == dog3));
		
		System.out.println("dog1.equals(dog2) -> " + (dog1.equals(dog2)));
		System.out.println("dog2.equals(dog3) -> " + (dog2.equals(dog3)));
		System.out.println("dog1.equals(dog3) -> " + (dog1.equals(dog3)));
	}
}
