//Q. Write a java program to take a integer between 1 to 7 and display the name of the weekday using switch case.

class Weekday {

	public static void main(String[] args) {
	
		int  day = 3;

		switch(day) {
		
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:						// It will get executed.
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		}
	}
}

/*  Output
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ vim p1.java 
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ javac p1.java 
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ java Weekday 
Wednesday
*/
