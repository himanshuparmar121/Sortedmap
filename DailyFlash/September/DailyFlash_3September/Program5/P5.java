// Q. Write a program to take three integers from user and print the minimum integer from them.


import java.io.*;

class Minimum {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter three integers: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());

		if(n1 < n2 && n1 < n3)
			System.out.println("The Minimum Number amongst " + n1 + ", " + n2 + " & " + n3 + " is " + n1);
		else if(n2 < n1 && n2 < n3)
			System.out.println("The Minimum Number amongst " + n1 + ", " + n2 + " & " + n3 + " is " + n2);
		else
			System.out.println("The Minimum Number amongst " + n1 + ", " + n2 + " & " + n3 + " is " + n3);
	}
}
