// Q. Write a program to take user input, based on user's choice and print the user input The progrm should have choices for int, String.

import java.io.*;

class InputDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1 for Integer and 2 for String!!!");
		int ch = Integer.parseInt(br.readLine());

		switch(ch) {
		
			case 1:
				System.out.print("Enter Integer: ");
				int n = Integer.parseInt(br.readLine());
				System.out.println("Integer Entered: " + n);
				break;

			case 2:
				System.out.print("Enter String: ");
				String s = br.readLine();
				System.out.println("String Entered: " + s);
				break;
		}
	}
}
