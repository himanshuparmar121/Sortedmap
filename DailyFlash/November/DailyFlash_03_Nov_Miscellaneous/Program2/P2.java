/* Draw Diva using pattern for Diwali festival for eg. 
 * 		
 * 		   ^
 * 		  ^ ^
 * 		   ^
 * 		   ~ ~ ~ ~ ~ ~ ~
 * 		     ~ ~ ~ ~ ~
 * 		       ~ ~ ~	         
 * 		         ~
 */

class Diya {

	public static void main(String[] args) {
	
		for(int i = 0; i < 3; i++) {
		
			for(int j = 0; j <= i; j++) {
			
				System.out.print(" ^ ");
			}

			System.out.println();
		}
	}
}

