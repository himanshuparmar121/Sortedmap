// Q. Write a Program to calculate the area of rectangle taking length and breath as input.

import java.io.*;

class Area {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter length and Breath: ");
		int l = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println("Area = " + (l * b));
	}
}
