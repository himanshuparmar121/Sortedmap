// In java, take a input String value from  the user and check whether the String value length is greater than 5 then only print the given String value.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String s = sc.next();

		if(s.length() >= 5)
			System.out.println("String: " + s);
		else
			System.out.println("Invalid String");
	}
}
