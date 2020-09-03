// Q. Write a program to implement Ohm's law.

import java.io.*;

class OhmLaw {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter current(in Ampere): ");
		float amp = Float.parseFloat(br.readLine());
		System.out.print("Enter resistance(in ohm): ");
		float r = Float.parseFloat(br.readLine());

		float v = amp * r;

		System.out.println("Voltage = " + v + " V");
	}
}
