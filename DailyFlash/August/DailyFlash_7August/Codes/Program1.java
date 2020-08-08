//Q1. Write a program to count number of digits in a number.

class Program {

	public static void main(String[] args) {
	
		int num = 12345;
		// sum = 1
		// num = 12345 / 10

		// sum = 2
		// 1234 / 10 = 123
		
		// sum = 3
		// 123 / 10 = 12

		// sum = 4
		// 12 / 10 = 1

		// sum = 5
		// 1 / 10 = 0
		
		// Out of loop
	
		int sum = 0;

		while(num != 0) {
		
			sum += 1;
			num = num / 10;
		}

		System.out.println("Sum of number of digits = " + sum);
	}
}

/* output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ vim Program1.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ javac Program1.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ java Program 
Sum of number of digits = 5
*/
