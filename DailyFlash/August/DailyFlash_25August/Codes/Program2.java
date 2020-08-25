// Q2. Write a Program that accepts an integer from user and print it.

import java.io.*;

class Input {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		System.out.println("Number: " + n);
	}
}
