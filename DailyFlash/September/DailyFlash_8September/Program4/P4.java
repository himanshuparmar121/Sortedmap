/*	7
 *	6 5 
 *	5 4 3
 *	4 3 2 1
 */

class Pattern {

	public static void main(String[] args) {
	
		int cnt = 0;

		for(int i = 0; i < 4; i++) {
		
			int num = 7;
			num = num - cnt;

			for(int j = 0; j <= i; j++) {
					
					System.out.print(" " + num);
					num--;
			}
			
			cnt++;
			System.out.println();
		}
	}
}
