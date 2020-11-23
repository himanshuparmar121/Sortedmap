/* WAP using StringBuffer for the following methods: charAt(int) to find character at 5th index and indexOf(String) to find index of "c" for the string
 * Input: Inception
 * Output: The character at index 5 is t
 * The index of "c" is 2
 */

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);

		System.out.print("Enter index: ");
		int idx = sc.nextInt();

		System.out.print("Enter character from String: ");
		String ch = sc.next();
		
		System.out.println("The character at index " + idx + " is: " + sb.charAt(idx));
		System.out.println("The index of " + ch + " is: " + sb.indexOf(ch));
	}
}
