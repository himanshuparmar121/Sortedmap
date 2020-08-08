class Assignment {

	public static void main(String[] args) {
	
		int num = 1;

		for(int i = 1; i <= 3; i++) {
		
			for(int j = 1; j <= 3; j++) {
			
				System.out.print(num * num + "   ");
				num++;
			}
			System.out.println();
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ vim AssignmentBySir3.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ javac AssignmentBySir3.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_7August/Codes$ java Assignment 
1   4   9   
16   25   36   
49   64   81   
*/
