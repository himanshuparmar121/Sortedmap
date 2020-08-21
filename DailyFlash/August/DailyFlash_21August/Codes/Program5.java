// Q5. Write a program to ASCII values of input character.

import java.io.*;

class ASCII {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Character: ");
		int ch = (char)br.read();
		System.out.println("ASCII value: " + ch);
	}
}
