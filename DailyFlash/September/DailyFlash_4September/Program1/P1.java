// Q. Write a program to print table in reverse order.

import java.io.*;

class Reverse {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number: ");
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 10; i >= 1; i--) {

			System.out.println(n + " x " + i + " : " + n*i);
		}
	}
}
