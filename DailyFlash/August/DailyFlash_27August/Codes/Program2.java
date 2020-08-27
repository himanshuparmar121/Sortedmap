// Q2. Write a Program that accepts two integers from user and prints multiplication & Division of them.

import java.io.*;

class MulDiv {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter two numbers: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		int max = 0, min = 0;

		if(n1 > n2) {
		
			max = n1;
			min = n2;
		} else {
		
			max = n2;
			min = n1;
		}

		System.out.println("Multiplication: " + (n1 * n2));
		System.out.println("Division: " + ((float) max / min));
	}
}
