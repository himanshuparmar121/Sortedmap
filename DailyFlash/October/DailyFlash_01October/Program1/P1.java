// Q. Wrute a java program which takes input from the user in array and print the array in reverse order.

import java.io.*;

class ArrayRecerse {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of array: ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < arr.length; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Reverse Array: ");
		for(int i = arr.length-1; i >= 0; i--) {
		
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}
}

