// Q5. Write a C program to calculate the factorial of given number.

import java.io.*;


class Factorial {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number to know it's factorial: ");
		int n = Integer.parseInt(br.readLine());

		int fact = 1;

		for(; n!= 0; n--) {
		
			fact = fact * n;
		}

		System.out.println("Factorial is " + fact);
	}
}
