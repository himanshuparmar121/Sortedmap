/*	1   2   3   4   5
 *	    4   6   8  10
 *	        9  12  15
 *	           16  20
 *	               25
 */

class Pattern {

	public static void main(String[] args) {
	
		int tmp = 1;

		for(int i = 0; i < 5; i++) {
		
			int n = 1;;
			
			for(int k = 0; k < i; k++) {
			
				System.out.print("   ");
				n++;
			}

			for(int j = 5; j > i; j--) {
			
				System.out.printf(" %2d", n*tmp);
				n++;
			}
			
			tmp++;
			System.out.println();
		}
	}
}
