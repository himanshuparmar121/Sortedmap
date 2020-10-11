/*	1 2 3 4 5
 *	2 3 4 5 1
 *	3 4 5 1 2
 *	4 5 1 2 3
 *	5 1 2 3 4
 */

class Pattern {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 5; i++) {
		
			int tmp = i;

			for(int j = 1; j <= 5; j++) {
			
				if(tmp <= 5) {
				
					System.out.print(" " + tmp);
					tmp++;
				} else {
				
					tmp = 1;
					System.out.print(" " + tmp);
					tmp++;
				}
			}

			System.out.println();
		}
	}
}
