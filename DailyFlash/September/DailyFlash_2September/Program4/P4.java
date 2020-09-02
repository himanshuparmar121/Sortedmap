/*	1
 *	4   9
 *     16  25  36
 *     49  64  81 100
 */

class Pattern {

	public static void main(String[] args) {
	
		int num = 1;

		for(int i = 0; i < 4; i++) {
	
			for(int j = 0; j <= i; j++) {
		
				System.out.printf("%3d ", num*num);
				num++;
			}

			System.out.println();
		}
	}
}
