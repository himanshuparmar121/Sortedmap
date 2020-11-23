// Write a program to take two strings from the user and append each character from the two strings alternatively but the second string  must be operated reversely and print the result.

import java.util.*;

class Program {

	public static void main(String... args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st String: ");
		String s1 = sc.next();
		StringBuffer str1 = new StringBuffer(s1);

		System.out.print("Enter 2nd String: ");
		String s2 = sc.next();
		StringBuffer str2 = new StringBuffer(s2);

		StringBuilder sb = new StringBuilder();

		str2.reverse();

		for(int i = 0; i < str1.length() || i < str2.length(); i++) {
		
			if(i < str1.length())
				sb.append(str1.charAt(i));
			
			if(i < str2.length())
				sb.append(str2.charAt(i));
		}

		System.out.println("Result: " + sb);
	}
}
