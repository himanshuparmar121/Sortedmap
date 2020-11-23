// Write a Program that accepts a String from the user and toggle each character in a string.

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String s1 = sc.next();

		char a[] = s1.toCharArray();

		for(int i = 0; i < s1.length(); i++) {
		
			if(a[i] >= 'A' && a[i] <= 'Z') {
			
				a[i] = (char)((int)a[i] + 32);
			} else {
			
				a[i] = (char)((int)a[i] - 32);
			}
		}

		System.out.print("Updated Array: ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]);

		System.out.println();
	}
}
