/*	A B C D
 *	  A B C
 *	    A B
 *	      A
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 0; i < 4; i++) {
		
			char c = 'A';

			for(int k = 0; k < i; k++) {
			
				System.out.print("  ");
			}

			for(int j = 4; j > i; j--) {
			
				System.out.print(" " + c);
				c++;
			}

			System.out.println();
		}
	}
}
