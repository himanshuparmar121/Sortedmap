// Q5. Write a program to print table of 4 in reverse order using while loop.

class Program {

	public static void main(String[] args) {
	
		int num = 40;

		while(num != 0) {
		
			System.out.print(num + " ");
			num -= 4;
		}
		System.out.println();
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ vim Program5.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ javac Program5.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ java Program 
40 36 32 28 24 20 16 12 8 4 
*/
