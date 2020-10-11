/*	2
 *	5 10
 *	17 26 37
 *	50 65 82 101
 */


class Pattern {

	public static void main(String[] args) {
	
		int n = 1;
		
		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j <= i; j++) {
				
				int num = n*n+1;
				System.out.printf("%2d ", num);
				n++;
			}

			System.out.println();
		}	
	}
}
