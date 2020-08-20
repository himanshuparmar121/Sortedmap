// Q3. Write a Program to check if a year is a leap year or not. (Note. If a year is divisible by 4 then it is leap year but if the year like 2000, 1900, 2100 then it must be divisible by 400.)

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter year: ");
		int year = Integer.parseInt(br.readLine());

		String output = (year % 4 == 0 || year % 400 == 0) ? "It is a Leap year." : "It is not Leap year";
		System.out.println(output);
	}
}
