// Q. Write a java Program which takes input from the user in array and print the greatest value of array.

import java.io.*;

class Greatest {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array: ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		System.out.println("Enter the array Rlements: ");
		for(int i = 0; i < arr.length; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0];

		for(int i = 0; i < arr.length; i++) {
		
			if(max < arr[i])
				max = arr[i];
		}

		System.out.println("Maximum Number: " + max);
	}
}
