/*		25
 *	     16 25
 *	   9 16 25
 *	 4 9 16 25
 *     1 4 9 16 25
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 0; i <= 4; i++) {
		
			int n = 1;

			for(int j = 0; j <= 4; j++) {
			
				if(i + j < 4) {
				
					System.out.print("   ");
					n++;
				} else {
				
					System.out.printf(" %2d", n*n);
					n++;
				}
			}

			System.out.println();
		}
	}
}
