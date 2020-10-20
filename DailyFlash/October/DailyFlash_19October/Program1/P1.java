/* Write a java program to find and replace the specific element from the array.
 * Input:
 * Enter elements: Bobby Lilly Arjun Priti
 * Find: Lilly
 * Replace: Rosh
 *
 * Output:
 * Elements in array: Bobby Rosh  Arjun Priti
 */

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int len = sc.nextInt();

		String[] arr = new String[len];

		System.out.println("Enter array elements:");
		for(int i = 0; i < len; i++) {
		
			arr[i] = sc.next();
		}

		System.out.print("Enter String to find: ");
		String find = sc.next();

		System.out.print("Enter String to Replace: ");
		String rep = sc.next();

		for(int i = 0; i < len; i++) {
		
			if(arr[i].equals(find)) {
			
				arr[i] = rep;
				break;
			}
		}
		
		System.out.println("array elements after correction:");
		for(int i = 0; i < len; i++) {
		
			System.out.print(arr[i] + " ");
		}

		System.out.println();

	}
}
