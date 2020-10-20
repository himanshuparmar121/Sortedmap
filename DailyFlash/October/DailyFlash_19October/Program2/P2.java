// Write a java program to reverse an array of integer values.

import java.util.*;

class ArrayDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		System.out.print("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
		
			arr[i] = sc.nextInt();
		}

		int[] rev = new int[5];
		for(int i = 0, j = 4; i < arr.length; i++, j--) {
		
			rev[j] = arr[i];
		}

		System.out.print("Reverse array: ");
		for(int i = 0; i < arr.length; i++) {
		
			System.out.print(rev[i] + " ");
		}

		System.out.println();
	} 
}
