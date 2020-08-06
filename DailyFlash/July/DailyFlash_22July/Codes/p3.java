// Write a java program to check whether that user is eligible for voting os not using ternary operator.

class Program3 {

	public static void main(String[] args) {
	
		int Age = 19;
		int eligible_age = 18;

		String ans = null;

		ans = (Age > eligible_age) ? "Eligible for voting" : "Not Eligiblr for Voting";
		System.out.println(ans);
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/22July$ javac p3.java 
himanshu@himansh:~/java9/DailyFlash/22July$ java Program3 
Eligible for voting
*/
