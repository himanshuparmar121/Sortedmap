// Q2. Write a program to calculate Simple Interest. Taking all essential terms to compute as input.

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Principle Amount: ");
		int prin = Integer.parseInt(br.readLine());

		System.out.print("Enter Rate (in %): ");
		float rate = Float.parseFloat(br.readLine());

		System.out.print("Enter Time (in Years): ");
		int time = Integer.parseInt(br.readLine());

		float si = prin * rate * time;

		System.out.println("Simple Interest = " + si);
	}
}
