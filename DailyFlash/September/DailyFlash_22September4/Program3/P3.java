// Q. Write a program where inside main() method create 2 objects of BufferedReader class as brOne and brTwo take your name as input from brOne object, take surname as input from brTwo and print them.
//  (Do not forget to call close after using brOne and brTwo)

import java.io.*;

class Input {

	public static void main(String[] args) throws IOException {
	
		BufferedReader brOne = new BufferedReader(new InputStreamReader(System.in));
		String fname = brOne.readLine();

		BufferedReader brTwo = new BufferedReader(new InputStreamReader(System.in));
		String lname = brTwo.readLine();

		System.out.println(fname + " " + lname);
	}
}
