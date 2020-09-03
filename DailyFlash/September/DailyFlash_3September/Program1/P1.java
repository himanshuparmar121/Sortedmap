// Q. Write  a Program which detects whether the entered number is perfect or not.

import java.io.*;

class PerfectNum {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int sum = 0;

		System.out.print("Enter a number:: ");
		int n = Integer.parseInt(br.readLine());

		for(int i = 1; i <= n / 2; i++) {

			if(n % i == 0)
				sum += i;
		}

		if(n == sum)
			System.out.println(n + " is a perfect number...");
		else
			System.out.println(n + " is not a perfect number...");
	}
}
