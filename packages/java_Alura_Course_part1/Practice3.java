
public class Practice3 {
	public static void main(String[] args) {
		//this is a comment, it does not affect the code
		
		//converting double to int:
		double a = 3.5;
		int b = (int) a;
		System.out.println(a + " and " + b);
		
		//int can't handle big numbers, so to those numbers we use long
		long bigNumber = 232324414214242421L;
		long negativeBigNumber = -232324414214242421L;
		//you need to put a "l" or L" at the end of the number
		
		//to handle small numbers, we use short
		short smallNumber = 30785;
		short negativeSmallNumber = -30785;
		
		//for reaaaally small numbers, we use byte
		byte reaaaalySmallNumbers = 122;
		
		//to handle small floating numbers:
		float anotherSmallNumber = 3.14f;
		//you need to put a "f" or "F" at the end of the number

		double sum = 0.1 + 0.2;
		//the result of this sum is not 0.3, actually
		System.out.println(sum);
		
		//printing the variables that i made to stop the warnings
		System.out.println(bigNumber + negativeBigNumber + smallNumber);
		System.out.println(negativeSmallNumber + reaaaalySmallNumbers + anotherSmallNumber);
	}
}
