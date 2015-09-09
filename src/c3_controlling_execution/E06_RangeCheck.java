/****************** Exercise 6 *****************
 * Modify the two test( ) methods in the previous two programs so that
 * they take two extra arguments, begin and end, and so that testval is tested to see if it is
 * within the range between (and including) begin and end.
 ************************************************/ 

package c3_controlling_execution;

public class E06_RangeCheck {
	static boolean test(int testval, int begin, int end) {
		if(testval >= begin && testval <= end)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(test(10, 5, 15));
		System.out.println(test(5, 10, 15));
		System.out.println(test(5, 5, 15));
	}

}
