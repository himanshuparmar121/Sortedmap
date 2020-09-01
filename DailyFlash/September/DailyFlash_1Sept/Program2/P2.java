// Q. Write a Program which accepts two integers from user and swaps their insertion order.

import java.io.*;

class Swap {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Two integers: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		System.out.println("Before Swap: " + n1 + " " + n2);
		System.out.println("After Swap: " + n2 + " " + n1);
	}
}
