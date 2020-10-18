// Accept a String from user and take a hardcoded string. Print both the strings seperated by one single quote(').

import java.io.*;

class StringDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a String: ");
		String s1 = br.readLine();

		String s2 = "Java9";
		System.out.println("String: " + s1 + " '" + s2);
	}
}
