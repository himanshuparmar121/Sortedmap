// Q3. Write a program to print Cubes and Squares of all Odd numbers ranges between given input number.

import java.io.*;

class SqrCube {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		for(int i = 1; i <= n; i++) {
		
			if(i % 2 != 0)
				System.out.println("Cube of " + i + ": " + i*i*i + " and Square of " + i + ": " + i*i);
		}
	}
}
