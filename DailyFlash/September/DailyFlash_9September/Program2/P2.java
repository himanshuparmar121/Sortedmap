// Q. Write a Program that prints series of Even numbers in reverse numbers in reverse order from the limiting number entered by user.

import java.io.*;

class EvenSeries {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the limiting number: ");
		int n = Integer.parseInt(br.readLine());

		for(; n >= 0; n--) {
		
			if(n % 2 == 0)
				System.out.print(" " + n);
		}

		System.out.println();
	}
}
