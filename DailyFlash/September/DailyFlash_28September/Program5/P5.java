/* Q. Write a program to print following binary pattern. Take number of rows from user using scanner class.
 * No. of rows: 5
 * 0 1 0 1 0
 * 1 0 1 0 1
 * 0 1 0 1 0
 * 1 0 1 0 1
 * 0 1 0 1 0
 */

import java.util.*;

class Pattern {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();

		for(int i = 1; i <= row; i++) {
		
			for(int j = 1; j <= 5; j++) {
			
				System.out.print((i+j) % 2);
			}

			System.out.println();
		}
	}
}
