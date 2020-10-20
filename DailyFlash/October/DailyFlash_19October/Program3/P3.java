// Write a java program to sum values of an array.

import java.util.*;

class ArrayDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int s = sc.nextInt();

		int[] arr = new int[s];
		int sum = 0;

		System.out.print("Enter array Elements: ");
		for(int i = 0; i < s; i++) {
		
			arr[i] = sc.nextInt();

			sum = sum + arr[i];
		}

		System.out.println("Sum = " + sum);
	}
}
