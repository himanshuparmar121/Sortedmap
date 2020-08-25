// Q1. Write a Program that accepts an integer from user and print Sum of all number up to entered number.

import java.io.*;

class Sum {

	public static void main(String[] args) throws IOException {
	
		int sum = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		for(int loop = 1; loop <= n; loop++) {
		
			sum += loop;	
		}

		System.out.println("Sum of all numbers upto " + n + " is: " + sum);
	}
}
