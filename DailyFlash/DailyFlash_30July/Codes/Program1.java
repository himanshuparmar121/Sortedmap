class Calculator {

	public static void main(String[] args) {
	
		int num1 = 20;
		int num2 = 30;

		switch('+') {
		
			case '+' :
				System.out.println(num1 + num2);  // 20+30 => 50
				break;
			case '-' :
				System.out.println(num1 - num2);  // 20-30 => -10
				break;
			case '*' :
				System.out.println(num1 * num2);  // 20*30 => 600
				break;
			case '/' :
				System.out.println(num1 / num2);  // 20 / 30 => 0
				break;
			case '%' :
				System.out.println(num1 % num2);  // 20 % 30 => 20
				break;
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ vim Program1.java
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ javac Program1.java
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ java Calculator 
50
*/
