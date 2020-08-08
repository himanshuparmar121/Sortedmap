class BreakDemo {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 50; i++) {
		
			if(i % 5 == 0 && i % 7 == 0)
				break;
			else
				System.out.println("Num = " + i);

		}

		System.out.println("Out of Loop");
	}
}

/* Output
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ vim WhileDemo3.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ vim BreakDemo.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ javac BreakDemo.java
himanshu@himansh:~/java9/DailyCodes/August/DailyCodes_6August/Codes$ java BreakDemo 
Num = 1
Num = 2
Num = 3
Num = 4
Num = 5
Num = 6
Num = 7
Num = 8
Num = 9
Num = 10
Num = 11
Num = 12
Num = 13
Num = 14
Num = 15
Num = 16
Num = 17
Num = 18
Num = 19
Num = 20
Num = 21
Num = 22
Num = 23
Num = 24
Num = 25
Num = 26
Num = 27
Num = 28
Num = 29
Num = 30
Num = 31
Num = 32
Num = 33
Num = 34
Out of Loop
*/
