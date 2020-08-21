// Q1. Write a Program to calculate the area of circle.

import java.io.*;

class Area {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Radius of circle: ");
		int radius = Integer.parseInt(br.readLine());
		
		double area = 3.14 * radius * radius;

		System.out.println("Area of circle of radius " + radius + " is: " + area);
	}
}
