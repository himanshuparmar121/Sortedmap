// Write a program to find if a String s1 contains another String s2 as a Substring or not.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String s1 = sc.next();

		System.out.print("Enter next String to check for substring: ");
		String s2 = sc.next();

		if(s1.contains(s2)) {
		
			System.out.println(s1 + " contains " + s2);
		} else {
		
			System.out.println(s1 + " doesn't contains " + s2);
		}
	}
}
