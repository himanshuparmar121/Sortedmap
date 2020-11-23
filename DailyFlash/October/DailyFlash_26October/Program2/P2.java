// Write a program to take a string and an index from the user. And toggle(if uppercase make it lowercase and vice versa) character of the given index from the string and print the result. 
// Print "Invalid Index" if index not present.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = sc.next();

		System.out.print("Enter index: ");
		int idx = sc.nextInt();

		char ch = str.charAt(idx);
		
		if(ch >= 'a' && ch <= 'z')
			ch -= 32;
		else
			ch += 32;

		str = str.substring(0, idx) + ch + str.substring(idx + 1);

		System.out.println(str);
	}
}
