/* WAJP that accepts 2 dimensional array of rows and columns from user, print that 2D array in matrix form and print diagonal element of array .
 * Input: 
 * Rows: 3
 * Columns: 3
 * Entered Matrix:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Diagonal element are 1 5 9.
 */

import java.util.*;

class Array2D {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rows:");
		int row = sc.nextInt();

		System.out.println("Enter Columns:");
		int col = sc.nextInt();

		int[][] marr =  new int[row][col];

		System.out.println("Enter Elements:");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				marr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array is: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				System.out.print(marr[i][j] + " ");
			}
			
			System.out.println();
		}

		System.out.print("Diagonal Elements are: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				if(i == j)
					System.out.print(marr[i][j] + " ");
			}
		}

		System.out.println();
	}
}
