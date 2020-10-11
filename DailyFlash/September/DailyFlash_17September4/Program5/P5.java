/*	A B C D E F
 *	A B C D E
 *	A B C D 
 *	A B C
 *	A B 
 *	A
 *	A
 *	A B
 *	A B C
 *	A B C D
 *	A B C D E
 *	A B C D E F
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 6; i++) {
		
			char c = 'A';
			
			for(int j = 6; j >= i; j--) {
			
				System.out.print(" " + c);
			}

			System.out.println();
		}

		for(int k = 1; k <= 6; k++) {

			char ch = 'A';

			for(int p = 1; p <= k; p++) {
			
				System.out.print(" " + ch);
			}

			System.out.println();
		}
	}
}
