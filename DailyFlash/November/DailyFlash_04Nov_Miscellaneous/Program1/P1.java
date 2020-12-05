// WAC of java, to accept a string from user and print it in reverse order using char Array.

import java.io.*;
import java.util.*;

class Reverse {

	public static void main(String[] args) throws IOException {
	
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		//String str = br.readLine();
		String str = sc.

		int n = str.length();
		char[] carr = new char[n];

		for(int i = 0; i < n; i++)
			carr[i] = str.charAt(n-i);
		
		System.out.println("Reversed String: ");

		for(int i = 0; i < n; i++)
			System.out.print(carr[i]);
		
		System.out.println();
	}
}
