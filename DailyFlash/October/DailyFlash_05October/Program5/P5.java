/* WAJP to reverse an array of integer values.
 * Enter number of rows: 6
 * INPUT: 12, 34, 56, 78, 90, 01
 * Output: 01, 90,78, 56, 34, 12
 */

import java.io.*;

class ReverseArray {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of array: ");
		int len = Integer.parseInt(br.readLine());

		int [] arr = new int[len];

		System.out.println("Enter Array Elements:");
		for(int i = 0; i < len; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int lindex = 0;
		int rindex = len - 1;
		
		for

	}
}
