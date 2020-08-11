// Q4. Write a java program to take a number as input and print series of factorials of numbers ranging up to that numbers from 1.

class Program {

	public static void main(String[] args) {
	
		int n = 10, fact = 1;

		for(int i = 1 ; i <= n ; i++) {
		

			fact = fact * i;
			System.out.println("Factorial of " + i + " is " + fact);
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ vim Program4.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ javac Program4.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ java Program 
Factorial of 1 is 1
Factorial of 2 is 2
Factorial of 3 is 6
Factorial of 4 is 24
Factorial of 5 is 120
Factorial of 6 is 720
Factorial of 7 is 5040
Factorial of 8 is 40320
Factorial of 9 is 362880
Factorial of 10 is 3628800
*/
