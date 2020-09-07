// Q. Write a Program that calculate addition of two complex numbers.

import java.io.*;

class Complex {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number1:: \nReal Part: ");
		int r1 = Integer.parseInt(br.readLine());
		System.out.print("Imaginary part: ");
		int i1 = Integer.parseInt(br.readLine());
		System.out.print("Enter Number2:: \nReal Part: ");
		int r2 = Integer.parseInt(br.readLine());
		System.out.print("Imaginary part: ");
		int i2 = Integer.parseInt(br.readLine());

		System.out.printf("\nAddition of %d + %di & %d + %di is %d + %di\n", r1, i1, r2, i2, r1 + r2, i1 + i2);
	}
}
