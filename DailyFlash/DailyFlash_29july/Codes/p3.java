// Q. Write a program to find greatest number among three numbers by using if-else ladder.

class ifElseLadder {

	public static void main(String[] args) {
	
		int a = 40;
		int b = 70;
		int c = 30;

		if(a > b && a > c)
			System.out.println("Largest Number = " + a);
		if(b > a && b > c)
			System.out.println("Largest Number = " + b);
		if(c > a && c > b)
			System.out.println("Largest Number = " + c);
	}
}

/*  Output
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ vim p3.java 
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ javac p3.java 
himanshu@himansh:~/java9/DailyFlash/29july/Codes$ java ifElseLadder 
Largest Number = 70
*/
