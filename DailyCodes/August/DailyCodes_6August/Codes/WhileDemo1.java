class WhileDemo {

	public static void main(String[] args) {
	
		int i = 1;

		while(i <= 20) {
		
			if(i % 2 == 0)
				System.out.println("Num = " + i);

			i++;
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ vim WhileDemo1.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ javac WhileDemo1.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ java WhileDemo 
Num = 2
Num = 4
Num = 6
Num = 8
Num = 10
Num = 12
Num = 14
Num = 16
Num = 18
Num = 20
*/
