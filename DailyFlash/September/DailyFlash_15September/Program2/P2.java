/*		0
 *	      0 1 
 *	    0 1 0
 *	  0 1 0 1
 *	0 1 0 1 0
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 0; i <= 4; i++) {
		
			for(int j = 0; j <= 4; j++) {
			
				if(i + j < 4) {
				
					System.out.print("  ");
				} else {
				
					if(i % 2 == 0 && j % 2 == 0) {
					
						System.out.print(" 0");
					} else {
					
						System.out.print(" 1");
					}
				}
			}

			System.out.println();
		}
	} 
}
