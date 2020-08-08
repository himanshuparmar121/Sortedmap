class Assignment {

	public static void main(String[] args) {

		int num = 1;

		for(int i = 1; i <= 3; i++) {
		
			for(int j = 1; j <= 3; j++) {

				System.out.print(num*num-1 + "  ");
				num++;
			}

			System.out.println("");
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ vim AssignmentBySir4.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ javac AssignmentBySir4.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ java Assignment 
0  3  8  
15  24  35  
48  63  80  
*/
