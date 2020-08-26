// Q4. Write a Program that accepts an integer from user and print table of that number.

import java.io.*;

class Tables {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number: ");
		int n = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 10; i++) {
		
			System.out.print(" " + (i*n));
		}

		System.out.println();
	}
}
