// Q. Write a program to take one side of square from user using BufferedReader & print the area & perimeter of that square.

import java.io.*;

class Square {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the length of a side: ");
		int side = Integer.parseInt(br.readLine());

		System.out.println("Area of square: " + (side*side));
		System.out.println("Parameter of square: " + (4*side));
	}
}
