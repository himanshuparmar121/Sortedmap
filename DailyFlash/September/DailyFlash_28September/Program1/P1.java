// Q. Write a java program to take name, roll number and field of interest from user and print in the format below:
// Input:
// Name: Rohan
// Roll No.: 101
// Feild of Interest: Art
//
// Output
// Hey, my name is Rohan and my roll number is 101. My field of interest are Art.

import java.util.*;

class StudentDetail {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Roll No.: ");
		int roll = sc.nextInt();

		System.out.print("Field of Interest: ");
		String interest = sc.next();

		System.out.println("Hey, my name is " + name + " and my roll number is " + roll + " . My field of Interest is " + interest + ".");
	}
}
