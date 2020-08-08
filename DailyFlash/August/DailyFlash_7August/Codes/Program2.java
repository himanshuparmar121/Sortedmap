// Q2. Write a program and print addition of even digit and multiplication of odd digit from number.


class Program {

	public static void main(String[] args) {
	
		int sum = 0, mul = 1, rem = 0;
		int num  = 123456;

		while(num != 0) {
		
			rem = num % 10;

			if(rem % 2 == 0) 
				sum += rem;
			else 
				mul *= rem;

			num = num / 10;
		}

		System.out.println("Sum of even numbers is " + sum);
		System.out.println("Multiplication of odd numbers is " + mul);
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ vim Program2.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ javac Program2.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ java Program 
Sum of even numbers is 12
Multiplication of odd numbers is 15
*/
