/*	1 1 1 1 1
 *	2 2
 *	3 3 
 *	4 4 
 *	5 5 5 5 5
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 1; i < 6; i++) {
			
			if(i == 2 || i == 3 || i == 4) {
				
				for(int j = 0; j < 2; j++) {
				
					System.out.print(" " + i);
				}
			} else {
			
				for(int k = 1; k < 6; k++) {
				
					System.out.print(" " + i);
				}
			}

			System.out.println();
		}
	}
}
