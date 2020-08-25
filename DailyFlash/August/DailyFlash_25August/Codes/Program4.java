// Q4. Write a Program that accepts an integer from user and prints whether that number is odd or even.

import java.io.*;

class EvenOdd {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number: ");
		int n = Integer.parseInt(br.readLine());

		if(n % 2 == 0)
			System.out.println(n + " is Even.");
		else
			System.out.println(n + " is Odd.");
	}
}
