// Q. Write a Program to print series of Even numbers ranging between two numbers entered by user.

import java.io.*;

class Range {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Min of Series: ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.print("Max of Series: ");
		int n2 = Integer.parseInt(br.readLine());

		System.out.print("Series Of Even Numbers Ranging between " + n1 + " & " + n2 + " is:");
		
		for(; n1 <= n2; n1++) {
		
			if(n1 % 2 == 0)
				System.out.print(" " + n1);
		}

		System.out.println();
	}
}
