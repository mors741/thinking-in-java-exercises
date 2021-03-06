/****************** Exercise 11 *****************
 * Modify the previous exercise so that your finalize( ) will always be
 * called.
 ************************************************/

package c4_initialization_and_cleanup;

public class E11_Finalize2 {
	public E11_Finalize2() {
		System.out.println("Constructor called");
	}
	
	protected void finalize() {
		System.out.println("finalizer called");
	}
	
	public static void main(String[] args) throws InterruptedException {
		new E11_Finalize2();
		System.out.println("System.gc()");
		System.gc();
		Thread.sleep(1000);
	}
}