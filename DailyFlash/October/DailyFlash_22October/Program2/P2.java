// Write a Program to take two Strings as input and check whether the first string starts with the second Stringor not, print yes or no as output.
//
// Input:
// String1: Core2Web
// String2: Core
//
// Output: Yes

import java.util.*;

class Program {

	public static void main(String... args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("String: ");
		String s1 = sc.next();
		
		System.out.print("Substring: ");
		String s2 = sc.next();
			
		if(s1.charAt(1) == s2.charAt(1)) 
			System.out.println("Yes");
		
		else 
			System.out.println("No");
	}
}
