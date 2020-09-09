// Q. Write a Program to that prints series of odd numbers in reverse numbers in reverse order from the limiting number entered by user.

import java.io.*;

class OddSeries {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a limiting number: ");
		int n = Integer.parseInt(br.readLine());

		for(; n > 0; n--) {
		
			if(n % 2 != 0)
				System.out.print(" " + n);	
		}

		System.out.println();
	}
}
