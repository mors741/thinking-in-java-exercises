/****************** Exercise 14 *****************
 * In Car.java add a service( ) method to Engine and call this method
 * in main( ).
 ************************************************/

package c6_reusing_classes;

class Engine {
	public void start() {
		
	}

	public void rev() {
		
	}

	public void stop() {
		
	}
	
	public void service() {
		
	}
}

class Wheel {
	public void inflate(int psi) {
	}
}

class Window {
	public void rollup() {
		
	}

	public void rolldown() {
		
	}
}

class Door {
	public Window window = new Window();

	public void open() {
		
	}

	public void close() {
		
	}
}

public class E14_Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door(); // 2-door

	public E14_Car() {
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}

	public static void main(String[] args) {
		E14_Car car = new E14_Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
	}
}