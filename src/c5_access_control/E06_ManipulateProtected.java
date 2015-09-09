/****************** Exercise 6 *****************
 * Create a class with protected data. Create a second class in the same file
 * with a method that manipulates the protected data in the first class.
 ************************************************/

package c5_access_control;

class ProtectedData {
	protected int i = 0;
}

class DataManipulator {
	private ProtectedData data;
	
	public DataManipulator(ProtectedData data) {
		this.data = data;
	}
	DataManipulator increment() {
		data.i++;
		return this;
	}
	DataManipulator showData() {
		System.out.println(data.i);
		return this;
	}
}

public class E06_ManipulateProtected {

	public static void main(String[] args) {
		DataManipulator manipulator = new DataManipulator(new ProtectedData());
		manipulator.increment().increment().increment().showData();

	}

}
