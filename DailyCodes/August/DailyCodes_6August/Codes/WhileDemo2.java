class WhileDemo {

	public static void main(String[] args) {
	
		int num = 145;
		int sum = 0;
		int rem = 0;

		// 145 % 10 = 5
		// 145 / 10 = 14
		// 14 % 10 = 4
		// 14 / 10 = 1
		// 1 % 10 = 1
		// 1 / 10 = 0

		while(num != 0) {
		
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}

		System.out.println("Sum = " + sum);
	}
}

/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ vim WhileDemo2.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ javac WhileDemo2.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ java WhileDemo 
Sum = 10
*/
