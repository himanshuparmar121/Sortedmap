// Write a program to take a string from the user and only print 5 characters from it using StringBuffer and print the result.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String str = sc.next();

		StringBuffer strBuff = new StringBuffer(str);

		strBuff.setLength(5);

		System.out.println(strBuff);
	}
}
