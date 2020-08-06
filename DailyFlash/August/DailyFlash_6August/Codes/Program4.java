class Divisiblity {

	public static void main(String[] args) {
	
		int num = 100;

		System.out.print("Reverse Order : ");

		for(int i = num; i >= 1; i--) {
		
			System.out.print(i + ", ");

		}

		System.out.println();
		System.out.println();
		
		System.out.print("Divisible by 5 is " );
		for(int i = num; i >= 1; i--) {
		
			if(i % 5 == 0)
				System.out.print(i + ", ");

		}

		System.out.println();
	}
}

/* Output
himanshu@himansh:~/java9/DailyFlash/DailyFlash_6August/Codes$ vim Program4.java
himanshu@himansh:~/java9/DailyFlash/DailyFlash_6August/Codes$ javac Program4.java
himanshu@himansh:~/java9/DailyFlash/DailyFlash_6August/Codes$ java Divisiblity 
Reverse Order : 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 

Divisible by 5 is 100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5, 
*/
