/*	A A A A A
 *	B B B B
 *	C C C
 *	D D
 *	E
 */

class Pattern {

	public static void main(String[] args) {
	
		char ch = 'A';

		for(int i = 0; i < 5; i++) {
		
			for(int j = 0; j < 5; j++) {
			
				if(i + j <= 4) {

					System.out.print(" " + ch);
				}
			}

			ch++;
			System.out.println();
		}
	}
}
