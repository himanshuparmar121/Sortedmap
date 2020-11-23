// Write a Program to take a String as input and a char and print the first and the last index of occurence of that char in the String.
//
// Input:
// String: Core2Web
// char: e
//
// Output:
// First Occurence: 3
// Last Occurence: 6

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = sc.next();

		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);

		System.out.println("First Occurence = " + str.indexOf(ch));
		System.out.println("Last Occurence = " + str.lastIndexOf(ch));
	}
}
