/* Write a java Program. Take string = "Core2web" from user. Implement the following operations with the same order:
 * 1. Concat with another string "Technologies"
 * 2. Calculate capacity.
 * 3. Concat with string "Biencaps".
 * 4. Calculate capacity.
 *
 * See the changes
 * Note: Use append() method
 */

import java.util.*;

class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
		String s1 = sc.next();
		StringBuffer sb = new StringBuffer(s1);

		sb.append("Technologies");

		System.out.println("Capacity: " + sb.capacity());

		sb.append("Biencaps");
		
		System.out.println("Capacity: " + sb.capacity());
	}
}
