/*	C
 *	C G
 *	C G K
 *	C G K O
 *	C G K O S
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 0; i <= 5; i++) {
		
			char c = 'C';

			for(int j = 0; j < i; j++) {
			
				System.out.print(" " + c);
				c += 4;
			}

			System.out.println();
		}
	}
}
