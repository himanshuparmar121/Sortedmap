// Q. Take input from user using Scanner class to print gmail account id.
// Input: 
// Enter String ID: Michelle
// Enter numerical ID: 1234
// Output:
// Michelle1234@gmail.com

import java.util.*;

class GmailId {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String ID: ");
		String name = sc.next();

		System.out.print("Enter numerical ID: ");
		int num = sc.nextInt();

		System.out.println(name + "" + num + "@gmail.com");
	}
}
