// Q. Write a Program that accepts an integer from user and prints its second successor and second predecessor.

import java.io.*;

class SuccPre {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		System.out.println("Second Successor = " + (n + 2));
		System.out.println("Second Predessor = " + (n - 2));
	}
}
