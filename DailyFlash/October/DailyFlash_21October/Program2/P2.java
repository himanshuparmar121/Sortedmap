// Take a input String value from user, and print the length of the String value.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.next();

		System.out.println("Length = " + s.length());
	}
}
