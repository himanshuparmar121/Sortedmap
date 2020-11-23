// WAP to check whether a string is a valid password or not.
// Password Rules:
// It nust be at least 8 characters.
// A password must consist at least one digit and one special symbol(@,%,$,#)

import java.util.*;

class Program {

	static boolean validPass(String pass) {
	
		int dig = 0, sp = 0;

		if(pass.length() > 8) {
		
			for(int i = 0; i < pass.length(); i++) {
			
				if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9')
					dig++;

				else if(pass.charAt(i) == '@' || pass.charAt(i) == '%' || pass.charAt(i) == '$' || pass.charAt(i) == '#')
					sp++;
			}

			if(dig >= 1 && sp >= 1)
				return true;
			else
				return false;
		} else
			return false;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a password: ");
		String password = sc.next();

		if(validPass(password))
			System.out.println("password is valid.");
		else
			System.out.println("password is Invalid.");
	}
}
