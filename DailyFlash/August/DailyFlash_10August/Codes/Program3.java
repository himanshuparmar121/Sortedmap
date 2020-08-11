// Q3. Write a java program to take a number as input and print series of prime numbers ranging up to that number from 1.

class Program {

	public static void main(String[] args) {

		int p = 0;
		
		for(int i = 1; i <= 20; i++) {

			int cnt = 0;
			for(p = i; p >= 1; p--) {

				if(i % p == 0)
					cnt = cnt + 1;

			}
			
			if(cnt == 2)
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ javac Program3.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ java Program 
2 3 5 7 11 13 17 19 
*/
