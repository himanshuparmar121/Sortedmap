// Q. Write a java Program which takes input from the user in array and print the sum of all elements.

import java.io.*;

class ArraySum {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of Array: ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		int sum = 0;

		System.out.println("Enter Array Elements: ");
		for(int i = 0; i < arr.length; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		System.out.println("Sum of all Array elements: " + sum);
	}
}
