// Q. Write a java Program that takes any year as input from user and prints whether that year or not.

import java.io.*;

class LeapYear {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a Year: ");
		int year = Integer.parseInt(br.readLine());

		if(year % 4 == 0) {
		
			System.out.println(year + " is a leap year.");
		} else {
		
			System.out.println(year + " is not a leap year.");
		}
	}
}
