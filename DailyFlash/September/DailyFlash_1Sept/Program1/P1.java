// Q. Write a program to print series of odd numbers ranging between two numbers entered by user.

import java.io.*;

class OddSeries {

	public static void main (String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Min. of Series: ");
		int n1 = Integer.parseInt(br.readLine());

		System.out.print("Max. of Series: ");
		int n2 = Integer.parseInt(br.readLine());

		System.out.print("Odd Numbers between " + n1 + " & " + n2 + ": ");	
		
		for(; n1 <= n2; n1++) {

			if(n1 % 2 != 0)
				System.out.print(" " + n1);
		}

		System.out.println();
	}
}
