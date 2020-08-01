class Student {

	int isEligible(int res) {
	
		if(res > 20)
			return 1;
		else 
			return 0;
	}

		public static void main(String[] args) {
		
			int res;
			int Student1 = 40;
			Student marks = new Student();
			res = marks.isEligible(Student1);

			if(res == 1)
				System.out.println("You Passed.");
			else
				System.out.println("Better luck Next time.");


		}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/24July/Codes$ vim Program5.java
himanshu@himansh:~/java9/DailyFlash/24July/Codes$ javac Program5.java
himanshu@himansh:~/java9/DailyFlash/24July/Codes$ java Student 
You Passed.
*/
