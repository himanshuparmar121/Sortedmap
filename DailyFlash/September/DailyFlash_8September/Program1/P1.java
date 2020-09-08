// Q. Write a Program that prints the series which increases with the number entered by user.

import java.io.*;

class Series {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number: ");
		int n = Integer.parseInt(br.readLine());

		for(int i = 1; i <= n*n; i = i + n) {
		
			System.out.print(" " + i);
		}

		System.out.println();
	}
}
