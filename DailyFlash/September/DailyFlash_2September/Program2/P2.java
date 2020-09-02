// Q. Write a Program that accepts Two integers from user and prints minimum number from them.

import java.io.*;

class Minimum {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter two numbers:");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		if(n1 < n2)
			System.out.println("The Minimum number amongst " + n1 + " & " + n2 + " is " + n1);
		else
			System.out.println("The Minimum number amongst " + n1 + " & " + n2 + " is " + n2);
	}
}
