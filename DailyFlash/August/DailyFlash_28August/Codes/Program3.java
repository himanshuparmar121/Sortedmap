/*      1
 *      2 3
 *      4 5 6
 *      7 8 9 10
 */

class Pattern {

	public static void main(String[] args) {
	
		int n = 1;

		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < 4; j++) {
			
				if(j <= i)
					System.out.print(" " + n++);
			}

			System.out.println();
		}
	}
}
