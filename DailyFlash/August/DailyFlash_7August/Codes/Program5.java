// Q.5 Write a program and prints the Average of all the number


class Program {

	public static void main(String[] args) {
	
		int num = 12345;
		int rem = 0, sum = 0, sum1 = 0;

		while(num != 0) {
		
			rem = num % 10;
			sum1 += rem;
			sum += 1;
			num = num / 10;
		}

		System.out.println("Average " + sum1 / sum);
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ vim Program5.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ javac Program5.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_7August/Codes$ java Program 
Average 3
*/
