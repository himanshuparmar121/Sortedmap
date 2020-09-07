// Q. Write a Program that accepts two integers from user and claculates the quotient & remainder from their division.

import java.io.*;

class Division {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter two numbers: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		System.out.println("Remainder = " + (n1 % n2) + " & Quotient = " + (n1 / n2));
	}
}
