/*      1
 *      2 2
 *      3 3 3
 *      4 4 4 4
 */

class Pattern {

	public static void main(String[] args) {
	
		int n = 1;

		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < 4; j++) {

				if(j <= i)
					System.out.print(" " + n);
			}

			n++;
			System.out.println();
		}
	}
}
