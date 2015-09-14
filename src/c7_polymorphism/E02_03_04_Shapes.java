/****************** Exercise 2 *****************
 * Add the @Override annotation to the shapes example.	
 ************************************************/

/****************** Exercise 3 *****************
 * Add a new method in the base class of Shapes.java that prints a
 * message, but don’t override it in the derived classes. Explain what happens. Now override it
 * in one of the derived classes but not the others, and see what happens. Finally, override it in
 * all the derived classes.
 ************************************************/

/****************** Exercise 4 *****************
 * Add a new type of Shape to Shapes.java and verify in main( ) that
 * polymorphism works for your new type as it does in the old types.
 ************************************************/

package c7_polymorphism;

import java.util.Random;

class Shape {
	public void draw() {
	}

	public void erase() {
	}
	
	public void newMethod() {
		System.out.println("Shape.newMethod()");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
	
	@Override
	public void newMethod() {
		System.out.println("Circle.newMethod()");
	}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}
}

class Ellipse extends Shape {
	@Override
	public void draw() {
		System.out.println("Ellipse.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Ellipse.erase()");
	}
}

// A "factory" that randomly creates shapes.
class RandomShapeGenerator {
	private Random rand = new Random();

	public Shape next() {
		switch (rand.nextInt(4)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Ellipse();
		}
	}
}

// Polymorphism in Java.
public class E02_03_04_Shapes {

	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// Make polymorphic method calls:
		for (Shape shp : s) {
			shp.draw();
			shp.newMethod();
			System.out.println();
		}
	}

}
