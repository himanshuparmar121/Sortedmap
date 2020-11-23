// Write a program to take two strings from the user and append each character from the two strings alternatively and print the result. (Note: Use of String Builder is a must)

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st String: ");
		String s1 = sc.next();

		System.out.print("Enter 2nd String: ");
		String s2 = sc.next();

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < s1.length() || i < s2.length(); i++) {
		
			if(i < s1.length())
			       	sb.append(s1.charAt(i));

			if(i < s2.length())
			       	sb.append(s2.charAt(i));
		}

		System.out.println("Result: " + sb);
	}
}
