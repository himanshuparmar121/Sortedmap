// Q4. Write a program that prints maximum digit from that number.

class Program {

	public static void main(String[] args) {
	
		int num = 12345903;
		int num1 = 0;
		int rem = 0, max = 0;

		num1 = num;

		while(num > 0) {
		
			rem = num % 10;
			
			if(rem > max)
				max = rem;

			num = num / 10;
		}

		System.out.println("Greatest digit amongst number " + num1 + " is " + max);
	}
} 

/* Output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ vim Program4.java 
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ javac Program4.java 
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ java Program 
Greatest digit amongst number 12345903 is 9
*/
