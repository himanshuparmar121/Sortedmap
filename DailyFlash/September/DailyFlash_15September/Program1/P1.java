/* 		A
 *    	      B C
 *	    C D E
 *	  D E F G
 *	E F G H I
 */

class Pattern {

	public static void main(String[] args) {

		char c = 'A';

		for(int i = 0; i <= 4; i++) {
	
			for(int k = 4; k >= i; k--) {
		
				System.out.print("  ");
			}

			for(int j = 0; j <= i; j++) {
		
				System.out.print(" " + c);
				c++;
			}
			c -= i;
			System.out.println();
		}
	}	
}
