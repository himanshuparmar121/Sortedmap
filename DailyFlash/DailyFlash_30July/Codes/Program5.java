class CheckNumber {

	public static void main(String[] args) {
	
		int num = 0;

		if(num < 0)
			System.out.println("Entered number is less than zero");
		else if(num > 0)
			System.out.println("Entered number is greater than zero");
		else 
			System.out.println("Entered number is equal to zero");

	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ vim Program5.java
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ javac Program5.java
himanshu@himansh:~/java9/DailyFlash/29July/Codes$ java CheckNumber 
Entered number is equal to zero
*/
