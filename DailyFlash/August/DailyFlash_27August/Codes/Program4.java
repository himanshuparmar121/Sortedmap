// Q4. Write a program to simulate simple calculator. Accept two integers from user and sign of operation to perform.

import java.io.*;

class Calculator {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 1st Number: ");
		int n1 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter 2nd Number: ");
		int n2 = Integer.parseInt(br.readLine());

		System.out.print("Enter operation to perform: ");
		char ch = (char)br.read();

		switch(ch) {
		
			case '+':
				System.out.println("Addition: " + (n1 + n2));
				break;
			case '-':
				System.out.println("Subtraction: " + (n1 - n2));
				break;
			case '*':
				System.out.println("Multiplication: " + (n1 * n2));
				break;
			case '/':
				System.out.println("Division: " + (float)( n1 / n2));
				break;
		}
	}
}
