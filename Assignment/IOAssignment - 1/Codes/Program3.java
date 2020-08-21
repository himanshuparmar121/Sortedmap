 import java.io.*;

 class Arithmetic {
 
	 public static void main(String[] args) throws IOException {
	 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		float num1 = Float.parseFloat(br.readLine());
		float num2 = Float.parseFloat(br.readLine());
		
		System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
		System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
	 }
 }
