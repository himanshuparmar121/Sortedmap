// Write a Program to take one String and two chars as input and replace the first char with second char in the String.
// Input:
// String: Core@web 
// char1: @
// char2: 2
//
// Output: Core2web

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("String: ");
		String s1 = sc.next();

		System.out.print("Character 1: ");
		char c1 = sc.next().charAt(0);
		
		System.out.print("Character 2: ");
		char c2 = sc.next().charAt(0);

		s1 = s1.replace(c1,c2);

		System.out.println(s1);
	}
}
