/* Write  java program to remove while spaces from string without using built-in methods.
 * Input: Core2web Technologies
 * Output: Core2webTechnologies
 */

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String s1 = sc.nextLine();

		for(int i = 0; i < s1.length(); i++) {
		
			if(s1.charAt(i) != ' ')
				System.out.print(s1.charAt(i));
		}

		System.out.println();
	}
}
