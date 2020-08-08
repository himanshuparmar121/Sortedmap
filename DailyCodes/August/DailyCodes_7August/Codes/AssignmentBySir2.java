class Assignment {

	public static void main(String[] args) {
	
		int num = 1;

		for(int i = 1; i <= 4; i++) {
		
			for(int j = 1; j <= 4; j++) {
			
				System.out.print(num + "   ");
				num++;
			}

			System.out.println();
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ vim AssignmentBySir2.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ javac AssignmentBySir2.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ java Assignment 
1   2   3   4   
5   6   7   8   
9   10   11   12   
13   14   15   16   
*/
