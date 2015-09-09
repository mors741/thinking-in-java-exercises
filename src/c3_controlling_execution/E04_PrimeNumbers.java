/****************** Exercise 4 *****************
 * Write a program that uses two nested for loops and the modulus
 * operator (%) to detect and print prime numbers (integral numbers that are not evenly
 * divisible by any other numbers except for themselves and 1).
 ************************************************/ 

package c3_controlling_execution;

class Container {
	private int[] ar;
	private int length;

	Container(int capacity) {
		ar = new int[capacity];
		length = 0;
	}

	int get(int index) {
		return ar[index];
	}

	void add(int el) {
		ar[length++] = el;
	}
	
	int getLength(){
		return length;
	}
	
	boolean isFull() {
		return length == ar.length;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(length*4);
		for (int i = 0; i < length; i++) {
			sb.append(get(i)).append(" ");
			if (i % 20 == 19) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}

public class E04_PrimeNumbers {

	public static void main(String[] args) {
		Container primes = new Container(1000);
		for (int num = 2; !primes.isFull();num++){
			boolean isPrime = true;
			for (int i = 0; i < primes.getLength(); i++) {
				if (num % primes.get(i)==0){
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(num);
			}
		}
		
		System.out.println(primes);
	}

}
