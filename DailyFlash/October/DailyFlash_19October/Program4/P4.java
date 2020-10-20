// Write a java program to find the index of an element in array.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int s = sc.nextInt();

		int[] arr = new int[s];

		System.out.print("Enter the elements of array: ");
		for(int i = 0; i < arr.length; i++) {
		
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the element to find it's position: ");
		int n = sc.nextInt();

		for(int i = 0; i < arr.length; i++) {
		
			if(n == arr[i]) {
			
				System.out.println("Position = " + (i + 1));
				break;
			}
		}

	}
}
