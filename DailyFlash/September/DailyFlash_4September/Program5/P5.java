// Q. Write a Program which accepts date month and year from user and checks for the validity of date according to month.

import java.io.*;

class CheckDate {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter date in dd/mm/yyyy format: ");
		int d = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		switch(m) {

			case 1:
				if(d <= 31)
					
					System.out.println("Entered Date is correct...");
				else
					
					System.out.println("Entered Date is correct...");
				break;

			case 2:
				if(y % 4 == 0 && d <= 29) {

					System.out.println("Entered Date is correct...");
				} else if(y % 4 != 0 && d <= 28) {

					System.out.println("Entered Date is correct...");
				} else

					System.out.println("Entered date is incorrect...");
				break;

			case 3:
				if(d <= 31)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 4:
				if(d <= 30)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 5:
				if(d <= 31)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 6:
				if(d <= 30)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 7:
				if(d <= 31)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 8:
				if(d <= 31)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 9:
				if(d <= 30)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 10:
				if(d <= 31)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 11:
				if(d <= 30)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;

			case 12:
				if(d <= 31)
					System.out.println("Entered Date is correct...");
				else
					System.out.println("Entered date is incorrect...");
				break;
		}
	}
}
