// Q. Write a java Program which takes age of students, find the maximum & print the index of maximum age. Take index of maximum age. Take values from user.

import java.io.*;

class Student {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter No. of Student age: ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i = 0; i < arr.length; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0];
		int index = 0;

		for(int i = 0; i < arr.length; i++) {
		
			if(max < arr[i]) {
			
				max = arr[i];
				index = i;
			}
			
		}

		System.out.println("Maximum Age = " + max + " and index = " + index);
	}
}
