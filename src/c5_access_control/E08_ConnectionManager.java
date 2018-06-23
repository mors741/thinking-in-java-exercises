/****************** Exercise 8 *****************
 * Following the form of the example Lunch.java, create a class called
 * ConnectionManager that manages a fixed array of Connection objects. The client
 * programmer must not be able to explicitly create Connection objects, but can only get them
 * via a static method in ConnectionManager. When the ConnectionManager runs out of
 * objects, it returns a null reference. Test the classes in main( ).
 ************************************************/

package c5_access_control;

public class E08_ConnectionManager {
	public static final int CAPACITY = 3;

	private int count = 0;
	private E08_Connection[] pool = new E08_Connection[CAPACITY];

	public E08_ConnectionManager() {
		for (int i = 0; i < CAPACITY; i++) {
			pool[i] = new E08_Connection();
		}
	}

	public E08_Connection getConnection() {
		if (count < CAPACITY) {
			return pool[count++];
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		E08_ConnectionManager connectionManager = new E08_ConnectionManager();
		for (int i = 0; i < 5; i++){
			System.out.println(connectionManager.getConnection());
		}
	}

	static class E08_Connection {

		private E08_Connection() {

		}

	}
} 
