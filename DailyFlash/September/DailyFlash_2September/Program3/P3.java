// Q. Write a Program to calculate Velocity of particle in the space having Distance & Time Entered By User.

import java.io.*;

class Velocity {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Distance (in metres): ");
		int d = Integer.parseInt(br.readLine());
		System.out.print("Enter Time (in sec): ");
		int t = Integer.parseInt(br.readLine());

		System.out.println("The Velocity of a Particle roaming in space is " + (float) d / t + "m/s.");
	}
}
