// Q. Write a Program to take integer value from user in loop, display sum of value's entered, if value entered is greater than 50 then break the loop (Choose any loop of your choice.)

import java.io.*;

class Sum {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number:");
		int n = Integer.parseInt(br.readLine());

		int sum = 0;

		while(true) {
		
			sum += n;

			System.out.println("Enter a number:");
			n = Integer.parseInt(br.readLine());

			if(n > 50) 
				break;
		}

		System.out.println("Sum = " + sum);
	}
}
