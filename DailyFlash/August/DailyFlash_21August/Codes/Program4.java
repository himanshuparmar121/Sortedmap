/* Pattern:             2 4 6 8 
 *                      2 4 6 8 
 *                      2 4 6 8
 *                      2 4 6 8
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int row = 0; row < 4; row++) {
		
			int num = 2;

			for(int col = 0; col < 4; col++) {
			
				System.out.print(num + " ");
				num = num + 2;
			}

			System.out.println();
		}
	}
}
