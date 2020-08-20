// Q1. Write a Program to take all three sides of a Triangle from user and check whether the triangle satisfies the Pythogorean Theorem.

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Base: ");
		int base = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Perpendicular: ");
		int perpen = Integer.parseInt(br.readLine());

		System.out.print("Enter Hypotenuse: ");
		int hypo = Integer.parseInt(br.readLine());

		if(base*base + perpen*perpen == hypo*hypo)
			System.out.println("The Triangle with sides " + base + ", " + perpen + " and " + hypo + " satisfies the Pythagoran Theorem.");
		else
			System.out.println("The Triangle with sides " + base + ", " + perpen + " and " + hypo + " does not satisfies the Pythagoran Theorem.");
	}
}
