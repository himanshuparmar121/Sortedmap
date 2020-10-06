// Q. Write a program to take two strings as a input from user using Scanner and print them in same line. And add space between them.
// Input:
// String1: Vijay
// String2: Devarkonda
// Result: Vijay Devarkonda

import java.util.*;

class InputDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String1: ");
		String s1 = sc.next();

		System.out.print("String2: ");
		String s2 = sc.next();

		System.out.println(s1 + " " + s2);
	}
}
