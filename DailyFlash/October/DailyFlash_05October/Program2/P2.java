/* WAP that ccepts 2D array of M rows & N columns from the user and prints only addition of even elements multiplied by max odd element from that array.
 * Input:
 * Enter Number of Rows & cols: 3 3 
 * Elemets:
 * 1 2 3
 * 3 4 5
 * 5 6 7
 *
 * Output:
 * Sum of Even Elements: 12
 * max Odd Elements: 7
 * Expected Output: 12 * 7 = 84
 */

import java.util.*;

class ArrayDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Rows: ");
		int r = sc.nextInt();

		System.out.print("Enter Number of Columns: ");
		int c = sc.nextInt();

		int[][] arr = new int[r][c];
		int even = 0, odd = 0;

		System.out.println("Enter Elements of Array:");
		for(int i = 0; i < r; i++) {
		
			for(int j = 0; j < c; j++) {
			
				arr[i][j] = sc.nextInt();

				if(arr[i][j] % 2 == 0)
					even++;
				else
					odd++;
			}
		}

		System.out.println("Array:");
		for(int i = 0; i < r; i++) {
		
			for(int j = 0; j < c; j++) {
			
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println();

		System.out.println("Even Numbers Count: " + even);
		System.out.println("Odd Numbers Count: " + odd);
		System.out.println("Even x Odd: " + (odd*even));
	}
}
