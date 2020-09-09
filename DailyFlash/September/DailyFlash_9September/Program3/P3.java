// Q. Write a program to convert the Hours entered by user into Seconds.

import java.io.*;

class SecToHrs {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter time in Hours: ");
		long hrs = Integer.parseInt(br.readLine());

		long secs = hrs * 3600;

		System.out.println("Seconds:: " + secs);
	}
}
