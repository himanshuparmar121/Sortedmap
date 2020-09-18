// Q. Write a Program to that prints the series which increases with the number entered by user.

import java.io.*;

class Series {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		for(int i  = 1; i <= 50; i = i + n) {
		
			System.out.print(i + " ");
		}

		System.out.println();
	} 
}
