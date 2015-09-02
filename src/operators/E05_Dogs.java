/****************** Exercise 5 *****************
 * Create a class called Dog with two Strings:
 * name and says. In main(), create two dogs,
 * "spot" who says, "Ruff!", and "scruffy" who
 * says, "Wurf!". Then display their names and
 * what they say.
 ***********************************************/

package operators;

class Dog {
	String name;
	String says;
	Dog(String name, String says){
		this.name = name;
		this.says = says;
	}
	
	public boolean equals(Object o) {
		Dog other = (Dog)o;
		return this.name == other.name
				&& this.says == other.says;
	}
}

public class E05_Dogs {
	public static void main(String[] args) {
		Dog dog1 = new Dog("spot", "Ruff!");
		Dog dog2 = new Dog("scruffy", "Wurf!");
		System.out.println(dog1.name + " says " + dog1.says);
		System.out.println(dog2.name + " says " + dog2.says);
	}
}
