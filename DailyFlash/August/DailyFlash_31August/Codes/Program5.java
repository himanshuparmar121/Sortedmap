// Q5. Write a Program that accepts an integer from user and prints all of its perfect divisors.

import java.io.*;

class PerfectDiv {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		System.out.print("Perfect divisors of " + n + " are: ");

		for(int i = 2; i <= n / 2; i++) {
		
			if(n % i == 0)
				System.out.print(i + " ");
		}

		System.out.println();
	}
}
