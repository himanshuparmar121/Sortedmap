// Find the number is Even or Odd using ternary operator.

class Program1 {

	public static void main(String[] args) {
	
		int num = 10;
		String ans = "NULL";
		
		ans = (num%2 == 0) ? "10 is even" : "10 is odd";

		System.out.println(ans);
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/22July$ vim p1.java
himanshu@himansh:~/java9/DailyFlash/22July$ javac p1.java 
himanshu@himansh:~/java9/DailyFlash/22July$ java Program1 
10 is even
*/
