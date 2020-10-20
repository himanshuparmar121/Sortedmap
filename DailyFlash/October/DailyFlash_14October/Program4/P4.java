/* WAJP to take an array of String as input from user and print the following pattern from those character
 * Example:
 * Input: {"I", "am", "Indian"}
 * Output:
 * I
 * Am Am
 * Indian Indian Indian
 */


import java.util.*;

class Program {

	public static void main(String... args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		String[] arr = new String[size];

		System.out.println("Enter array elements:");

		for(int i = 0; i < size; i++) {
		
			arr[i] = sc.next();
		}

		for(int i = 0; i < size; i++) {
		
			for(int j = 0; j <= i; j++) {
			
				System.out.print(arr[i] + " ");
			}

			System.out.println();
		}
	}
}
