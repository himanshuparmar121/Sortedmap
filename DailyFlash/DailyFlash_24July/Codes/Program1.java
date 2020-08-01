class Program1 {

	int OddEven(int num) {
	
		if(num % 2 == 0) 
			return 1;
		else 
			return 0;
	}

	public static void main(String[] args) {
	
		int res1, res2;
		int a = 4;
		int b = 5;
		Program1 Obj = new Program1();
		res1 = Obj.OddEven(a);
		res2 = Obj.OddEven(b);

		if(res1 == 1)
			System.out.println("Number " + a + " is even.");
		else
			System.out.println("Number " + a + " is odd.");
		
		if(res2 == 1)
			System.out.println("Number " + b + " is even.");
		else
			System.out.println("Number " + b + " is odd.");

	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/24July/Codes$ vim Program1.java
himanshu@himansh:~/java9/DailyFlash/24July/Codes$ javac Program1.java
himanshu@himansh:~/java9/DailyFlash/24July/Codes$ java Program1 
Number 4 is even.
Number 5 is odd.
*/
