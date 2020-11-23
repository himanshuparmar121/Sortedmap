// Write a program to check whether a string is a palindrome or not.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		String s1 = new String();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s2 = sc.next();

		for(int i = (s2.length()-1); i >= 0; i--) {
		
			s1 = s1 + s2.charAt(i);
		}

		if(s2.equals(s1))
			System.out.println(s1 + " is palindrome.");
		else
			System.out.println(s1 + " is not palindrome.");
	}
}
