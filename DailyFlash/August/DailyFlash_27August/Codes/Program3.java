// Q3. Write a program that accepts two integers from user and prints addition of their cubes and subtraction of their Squares.

import java.io.*;

class SqrCube {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter two numbers:");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		System.out.println("Addition of " + (n1 * n1 * n1) + " and " + (n2 * n2 * n2) + " is: " + (n1 * n1 * n1 + n2 * n2 * n2));
		System.out.println("Subtraction of " + (n1 * n1) + " and " + (n2 * n2) + " is: " + (n1 * n1 - n2 * n2));
	}
}
