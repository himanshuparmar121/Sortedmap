// Write a program and count the number of vowels in string.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String s = sc.next();

		for(int i = 0; i < s.length(); i++) {
		
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				cnt++;
		}

		System.out.println("Count = " + cnt);
	}
}
