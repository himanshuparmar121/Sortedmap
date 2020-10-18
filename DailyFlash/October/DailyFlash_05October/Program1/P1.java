/* WAP that accepts two array pf length N from the user and Computes multiplication of elements at same index from those array and stores that multiplication into third array at the same index, print third array
 * Input:
 * Length of array: 6
 * Enter Elements in First array: 1 4 3 2 5 6
 * Enter Elements in Second array: 1 2 3 4 5 6
 *
 * Output:
 * After Operation the elements in third array: 1 8 9 8 25 36
 */

import java.util.*;

class ArrayDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of array: ");
		int len = sc.nextInt();

		int[] arr1 = new int[len];
		int[] arr2 = new int[len];

		System.out.println("Enter elements of Array1:");
		for(int i = 0; i < len; i++) {
		
			arr1[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Enter elements of Array2:");
		for(int i = 0; i < len; i++) {
		
			arr2[i] = sc.nextInt();
		}
		
		System.out.println();

		System.out.print("After Operation the Elements in Third Array: ");
		for(int i = 0; i < len; i++) {
		
			System.out.print((arr1[i]*arr2[i]) + " ");
		}

		System.out.println();
	}
}
