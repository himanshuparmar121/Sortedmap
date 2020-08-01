class IfLadderDemo {

	public static void main(String[] args) {
	
		int x = 25;

		if(x >= 0 && x <= 10)
			System.out.println("Number b/w 0 and 10");
		else if(x >= 10 && x <= 20)
			System.out.println("Number b/w 10 and 20");
		else if(x >= 20 && x <= 30)
			System.out.println("Number b/w 20 and 30");
		else if(x >= 30)
			System.out.println("Number greater than 30");
		else
			System.out.println("Please enter positive Number");
	}
}

/* Output
himanshu@himansh:~/java9/July/28July/Codes$ vim ifElseDemo1.java
himanshu@himansh:~/java9/July/28July/Codes$ javac ifElseDemo1.java
himanshu@himansh:~/java9/July/28July/Codes$ java IfLadderDemo 
Number b/w 20 and 30
*/
