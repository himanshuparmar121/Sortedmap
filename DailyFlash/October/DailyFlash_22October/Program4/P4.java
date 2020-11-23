// Write a program to take two Strings as input as First Name and Last Name and print the first name in Uppercase and Last Name in Lowercase.
//
// Input:
// Fname: Tony
// Lname: Stark
//
// Output: TONY Stark

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Fname: ");
		String str1 = sc.next();

		System.out.print("Lname: ");
		String str2 = sc.next();

		System.out.println(str1.toUpperCase() + " " + str2.toLowerCase());
	}
}
