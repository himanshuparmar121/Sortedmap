// Q. Write a Program that calculates Kinetic energy of object with given Mass & velocity. {Note: K.E. = 1/2 * m * v * v}

import java.io.*;

class KineticEnrgy {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter mass and velocity: ");
		int m = Integer.parseInt(br.readLine());
		int v = Integer.parseInt(br.readLine());

		double ke = 0.5 * m * v * v;

		System.out.println("Kinetic Energy = " + ke);
	}
}
