// Q2. Write a java program to print addition of 1 to 10 with 10 to 1.

class Program {

	public static void main(String[] args) {
	
		for(int i = 1, j = 10; i <= 10; i++, j--) {
		
			int n = i + j;
			System.out.println(i + " + " + j + " = " + n);
		}
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ vim Program2.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ javac Program2.java
himanshu@himansh:~/java9/DailyFlash/August/DailyFlash_10August/Codes$ java Program 
1 + 10 = 11
2 + 9 = 11
3 + 8 = 11
4 + 7 = 11
5 + 6 = 11
6 + 5 = 11
7 + 4 = 11
8 + 3 = 11
9 + 2 = 11
10 + 1 = 11
*/
