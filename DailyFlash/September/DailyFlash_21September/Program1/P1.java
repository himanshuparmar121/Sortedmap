/*	* * *
 *	  * * *
 *	    * * *
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 3; i++) {
		
			for(int k = 0; k < i; k++) {
			
				System.out.print("  ");
			}

			for(int j = 1; j <= 3; j++) {
			
				System.out.print(" *");
			}

			System.out.println();
		}
	}
}
