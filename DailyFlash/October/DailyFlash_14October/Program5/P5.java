/* Write a java program to check whether the given integer array entered by user is monotonic or not.
 * Note: An array is monotone increasing or monotone decreasing.
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j]. An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 * Return true if and only if the given array A is monotonic.
 *
 * Structure of code:
 * -Take an integer array as input from user of size defined by user.
 * -Pass this array to a static method checkMonotonic() having return type as Boolean.
 * -If true print the array is monotonic else print is not monotonic.
 *
 *  Example:
 *  Input:
 *  size = 4, [1,2,2,3]
 *
 *  Output:
 *  The array is monotonic 
 *  
 *  Input:
 *  size = 3, [1,3,2]
 *
 *  Output:
 *  The array is not monotonic.
 */

import java.util.*;

class Program {

	static boolean isMonotonic(int[] A) {
		
		if(A.length == 1)
			return true;

		int first = A[0];
		int last = A[A.length-1];

		if(last >= first) {
			
			for(int i = 0; i < A.length-1; i++) {
				
				if(A[i] > A[i+1]) {
					
					return false;
				}
			}
		} else {
			
			for(int i = A.length-1; i > 0; i--) {
				
				if(A[i] > A[i-1]) {
					
					return false;
				}
			}
		}

		return true;
	}
		
	public static void main(String[] args) {
	
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elemnts of array:");
		for(int i = 0; i < size; i++) {
		
			arr[i] = sc.nextInt();
		}

		if(isMonotonic(arr) == true)
			System.out.println("The given array is Monotonic");
		else
			System.out.println("The given array is not Monotonic");
	} 
}
