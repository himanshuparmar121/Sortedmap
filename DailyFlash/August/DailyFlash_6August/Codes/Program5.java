class Program {

	public static void main(String[] args) {
	
		System.out.print("Table of 3 is ");
		for(int i = 1; i <= 30; i++) {
		
			if(i % 3 == 0)
				System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.print("Even numbers present in table are ");
		for(int i = 1; i <= 30; i++) {
		
			if(i % 3 == 0 && i % 2 == 0)
				System.out.print(i + ", ");
		}
		System.out.println();
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/DailyFlash_6August/Codes$ vim Program5.java
himanshu@himansh:~/java9/DailyFlash/DailyFlash_6August/Codes$ javac Program5.java
himanshu@himansh:~/java9/DailyFlash/DailyFlash_6August/Codes$ java Program 
Table of 3 is 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 
Even numbers present in table are 6, 12, 18, 24, 30, 
*/
