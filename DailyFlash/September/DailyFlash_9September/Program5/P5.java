// Q. Write a Program that calculates the greatest Common Divisor of two entered numbers.

import java.io.*;

class GCD {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int max = 0, grt = 0;

		System.out.println("Enter two numbers:");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		if(n1 >= n2)
			grt = n1;
		else
			grt = n2;

		for(int i = 1; i <= grt / 2; i++) {
		
			if(n1 % i == 0 && n2 % i == 0) {

				max = i;
			}
		}

		System.out.println("The greatest common factor of " + n1 + " & " + n2 + " is " + max);
	}
}

