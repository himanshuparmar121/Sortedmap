// Q. Write a program to toggle a single character i.e., if a letter is in upper case converts it in lower case and if a letter is in lower case convert it into upper case.

class Toggle {

	public static void main(String[] args) {
	
		char sum1 = 'A' + 32;
		char sum2 = 'a' - 32;

		System.out.println("Toggle value of 'A' = " + sum1);
		System.out.println("Toggle value of 'a' = " + sum2);
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ vim p2.java 
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ javac p2.java 
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ java Toggle 
Toggle value of 'A' = a
Toggle value of 'a' = A
*/
