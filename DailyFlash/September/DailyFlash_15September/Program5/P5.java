/*	1 2 3 4 5
 *	3 4 5 6
 *	5 6 7
 *	7 8
 *	9
 */

class Pattern {

	public static void main(String[] args) {
	
		int n = 1, dup = 3;

		for(int i = 0; i < 5; i++) {
		
			for(int j = 5; j > i; j--) {
			
				System.out.print(" " + n);
				n++;
			}

			n = n - dup;
			dup--;
			System.out.println();
		}
	}
}
