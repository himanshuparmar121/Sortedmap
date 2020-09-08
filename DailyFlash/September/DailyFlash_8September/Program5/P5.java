// Q. Write a Program that prints series of perfect numbers up to the entered limiting number.

import java.io.*;

class Perfect {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the limiting number:: ");
		int n = Integer.parseInt(br.readLine());

		System.out.print("List of perfect numbers form 1 to " + n + " :: 1 ");

		for(int i = 1; i <= n; i++) {
		
			int sum = 0;
			
			for(int j = 1; j <= i / 2; j++) {
			
				if(i % j == 0) {

					sum += j;
				}
			}

			if(sum == i)
				System.out.print(" " + i);
		}

		System.out.println();
	}
}
