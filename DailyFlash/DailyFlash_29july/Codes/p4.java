// Q. Write a code in java to check divisibility of a number by 2 using bitwise operators.
// * Note: Don't use arithmetic operators to check divisiblity.
// ***Format of code***
// Write a static function: isDivisible
// Integer parameters: dividend and divisor.
// Return type: boolean
// In main method:
// 	Take two integer variables dividend and divisor (Note: divisor should be 2 as we are checking divisiblity by 2).
// 	Call isDivisible method from if statement and print Yes if the method returns true else print No if the method return false.

class Divisiblity {


	static boolean isDivisible(int dividend, int divisor) {

		int ans = (dividend << divisor) ^ (dividend >> divisor);
		
		if(ans != 0)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
	
		boolean res;
		int a = 8;
		int b = 2;

		res = isDivisible(a, b); 

		if(res == false)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
