// Q5. Write a Program to accept 10 integers from user and prints the sum & average of entered numbers.

import java.io.*;

class Avg {

	public static void main(String[] args) throws IOException {
	
		int n, sum = 0, cnt = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		for(int loop = 1; loop <= 10; loop++) {
		
			n = Integer.parseInt(br.readLine());
			sum += loop;
			cnt++;
		}

		System.out.println("Sum of all 10 Integers is: " + sum);

		float avg = sum / 10;
		
		System.out.println("Average = " + avg);
	}
}
