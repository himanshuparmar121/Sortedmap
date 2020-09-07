// Q. Write a Program to swap two entered number without using a third temporary variable.

import java.io.*;

class Swap {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); 

		System.out.print("Enter a & b: ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println("Before Swap: a = " + a + " & b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swap: a = " + a + " & b = " + b);
	}
}
