// Q1. Write a program that accepts two integers from user and prints addition & Subtraction of them.

import java.io.*;

class AddSub {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter a number: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		int max = 0, min = 0;

		if(n1 > n2) {
		
			max = n1;
			min = n2;
		} else {
		
			max = n2;
			min = n1;
		}

		System.out.println("Addition: " + (n1 + n2));
		System.out.println("Subtraction: " + (max - min));
	}
}
