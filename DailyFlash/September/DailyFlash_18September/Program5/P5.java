// Q. Write a program that accepts two int from user and prints the series of factorial of all numbers between those two inputs.

import java.io.*;

class FactorialSeries {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two numbers: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		for(; n1 <= n2; n1++) {
		
			int fact = 1;

			for(int i = 1; i <= n1; i++) {
			
				fact = fact * i;
			}

			System.out.println("Factorial of " + n1 + ": " + fact);
		}
	}
}
