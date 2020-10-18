/* Write a Program that accepts two matrices of m*n order from user then add each elements from those arrays and store the addition into third array.
 * Input:
 * Enter rows(n) & cols(m) = 2 2
 * Enter matrices: 
 * 1 2     1 2
 * 3 4     3 4
 *
 * Output:
 * The Third matrix is:
 * 2 4
 * 6 8
 *
 */

import java.util.*;

class Array {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows: ");
		int r = sc.nextInt();
		
		System.out.print("Enter Columns: ");
		int c = sc.nextInt();

		int[][] arr1 = new int[r][c];
		int[][] arr2 = new int[r][c];
		int[][] ans = new int[r][c];

		System.out.println("Enter elementss of Array1:");
		for(int i = 0; i < r; i++) {
		
			for(int j = 0; j < c; j++) {
			
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter elementss of Array2:");
		for(int i = 0; i < r; i++) {
		
			for(int j = 0; j < c; j++) {
			
				arr2[i][j] = sc.nextInt();
			}
		}

		System.out.println("The Third Matrix:");
		for(int i = 0; i < r; i++) {
		
			for(int j = 0; j < c; j++) {
			
				ans[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(ans[i][j] + " ");
			}

			System.out.println();
		}
	}
}
