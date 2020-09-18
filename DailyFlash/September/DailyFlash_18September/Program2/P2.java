// Q. Write a program to that prints series Square of even number and cuve of odd number between the limits entered by user.

import java.io.*;

class Series {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter first limit: ");
		int n1 = Integer.parseInt(br.readLine());

		System.out.print("Enter second limit: ");
		int n2 = Integer.parseInt(br.readLine());

		while(n1 <= n2) {
		
			if(n1 % 2 == 0) {
			
				System.out.print(n1*n1 + " ");
			} else {
			
				System.out.print(n1*n1*n1 + " ");
			}

			n1++;
		}

		System.out.println();
	}
}
