/* Write a java Program to take a string from the user. Implement the below methods for StringBuffer class:
 * - insert()
 * - reverse()
 * - replace()
 * - delete()
 * - charAt()
 * - substring()
 */

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("String: ");
		String s = sc.next();

		StringBuffer sb = new StringBuffer(s);

		sb.insert(8, "technologies");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
		sb.reverse();

		sb.replace(8, 9, "T");
		System.out.println(sb);

		sb.delete(8, 20);
		System.out.println(sb);

		System.out.println(sb.charAt(3));

		System.out.println(sb.substring(0,4));
	}
}
