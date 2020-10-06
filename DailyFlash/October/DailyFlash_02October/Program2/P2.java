/* WAJP that accepts 2D array of rows and columns from user, print that 2D array in matrix form and print even elements of array and print addition of even numbers.*/

import java.util.*;

class ArrayEven {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row:");
		int row = sc.nextInt();

		System.out.println("Enter Columns:");
		int col = sc.nextInt();

		int[][] marr = new int[row][col];

		System.out.println("Enter elements:");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				marr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array:");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				System.out.print(marr[i][j] + " ");
			}

			System.out.println();
		}

		int sum = 0;

		System.out.print("Even Numbers in array:");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				if(marr[i][j] % 2 == 0) {

					System.out.print(marr[i][j] + " ");
					sum = sum + marr[i][j];
				}
			}
		}

		System.out.println("Addition of even numbers: " + sum);


	}
}
