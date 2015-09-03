/******************************* Exercise 4 ********************************
 * Write a program that calculates velocity using a constant distance and a
 * constant time. 
 ***************************************************************************/

package c2_operators;

public class E04_CalculateVelocity {
	/**
	 * 
	 * @param distance in meters
	 * @param time in seconds
	 * @return velocity in meters per second
	 */
	public static double calculateVelocity(double distance, double time) {
		return distance / time;
	}

	public static void main(String[] args) {
		if(args.length < 2) {
			 System.err.println(
			 "Usage: java E04_Velocity distance time");
			 System.exit(1);
			 }
			 double distance = Double.parseDouble(args[0]);
			 double time = Double.parseDouble(args[1]);
			 System.out.print("Velocity = ");
			 System.out.print(calculateVelocity(distance, time));
			 System.out.println(" m/s"); 
	}

}
