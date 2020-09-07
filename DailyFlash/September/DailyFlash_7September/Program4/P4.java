/*	7
 *	7 6
 *	6 5 4 
 *	4 3 2 1
 */

class Patterm {

	public static void main(String[] args) {
	
		int n = 6;

		for(int i = 0; i < 4; i++) {
		
			n = n+1;

			for(int j = 0; j <= i; j++) {
			
				System.out.print(" " + n);
				n--;
			}

			System.out.println();
		}
	}
}
