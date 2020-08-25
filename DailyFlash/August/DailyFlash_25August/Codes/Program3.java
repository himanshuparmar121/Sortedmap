/* Q3. Pattern          
 *                      0 0 0 0 
 *                      1 1 1 1
 *                      0 0 0 0 
 *                      1 1 1 1
 */

import java.io.*;

class Pattern {

	public static void main(String[] args) throws IOException {
	
		for(int row = 0; row < 4; row++) {
		
			for(int col = 0; col < 4; col++) {
			
				if(row % 2 == 0)
					System.out.print(" 0 ");
				else
					System.out.print(" 1 ");
			}

			System.out.println();
		}
	} 
}
