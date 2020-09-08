// Q. Write a Program that takes ruppees as input from user and prints output.

import java.io.*;

class Currency_Converter {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter amount in Rupeed: Rs ");
		int rs = Integer.parseInt(br.readLine());

		System.out.println("\nAmount in Dollars: $ " + (0.0136 * rs));
	}
}
