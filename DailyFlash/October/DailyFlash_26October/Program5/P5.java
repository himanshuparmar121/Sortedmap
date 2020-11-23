// Write a program to take a string and substring from the user and find the last occurence index of the substring and print the result. Print appropriate message if Substring is not print.

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter String: ");
		String str = br.readLine();

		System.out.print("Enter Substring: ");
		String substr = br.readLine();

		int l = substr.length();
		char ch2 = substr.charAt(l-1);

		System.out.println("last occurence index of substring: " + str.lastIndexOf(ch2));
	}
}
