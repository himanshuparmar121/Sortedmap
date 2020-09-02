// Q. Write a Program that accepts Three integers from user and prints maximum number from them.

import java.io.*;

class Maximum {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter three integers:: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());

		if(n1 > n2 && n1 > n3)
			System.out.println("The Maximum number amongst " + n1 + " " + n2 + " & " + n3 + " is " + n1);
		else if(n2 > n1 && n2 > n3)
			System.out.println("The Maximum number amongst " + n1 + " " + n2 + " & " + n3 + " is " + n2);
		else if(n3 > n1 && n3 > n2)
			System.out.println("The Maximum number amongst " + n1 + " " + n2 + " & " + n3 + " is " + n3);
		else
			System.out.println("Invalid");
	}
}
