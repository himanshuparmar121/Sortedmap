// Q. Write a program which accepts marks of students in 1-D array & find total marks & percentage.

import java.io.*;

class Array {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter no. of marks: ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		int sum = 0;
	       	double per = 0;

		System.out.println("Enter Marks: ");
		for(int i = 0; i < n; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		per = sum / n;

		System.out.println("Total Marks: " + sum + " & Percentage: " + per);
	}
}
