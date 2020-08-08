// Q3. Write a program using while loop to print first 10 numbers which are divisible by 32 and 7. (Break the loop if any number divisible by 32 and 7 is also divisible by 6).

class Program {

	public static void main(String[] args) {
	
		for(int num = 200; num <= 2240; num++) {
			
			if(num % 7 == 0 && num % 32 == 0)
				System.out.print(num + " ");
		
			if(num % 7 == 0 && num % 32 == 0 && num % 6 == 0) {
				
				System.out.println();
				System.out.println("Breaking Loop");
				System.out.println(num + " is divisible by 6");
				break;
			}
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ vim Program3.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ javac Program3.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ java Program 
224 448 672 
Breaking Loop
672 is divisible by 6
*/
