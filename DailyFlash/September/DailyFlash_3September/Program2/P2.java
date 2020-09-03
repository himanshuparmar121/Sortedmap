// Q. Write a Program that accepts two integers from user and prints the series of factorial of all numbers between those two inputs.

import java.io.*;

class Factorial {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter two numbers:: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		for(; n1 <= n2; n1++) {

			int fact = 1;
			for(int i = 1; i <= n1; i++) {

				fact *= i;
			}

			System.out.println("Factorial of "+ n1 +" is: "+ fact);
		}
	}
}
