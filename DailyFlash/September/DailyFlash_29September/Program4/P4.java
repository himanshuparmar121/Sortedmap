/* Q. Take the array of element {A, B, C, D, E} and print the following pattern
 * O/P
 * A B C D E
 * B C D E
 * C D E
 * D E
 * E
 */

class Array {

	public static void main(String[] args) {
	
		char[] arr = {'A', 'B', 'C', 'D', 'E'};

		for(int i = 0; i < arr.length; i++) {
		
			for(int j = i; j < arr.length; j++) {
	
				System.out.print(arr[j] + " ");
			}

			System.out.println();
		}
	}
}
