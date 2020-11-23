/*		1
 *	       1 1
 *	      1 2 1
 *	     1 3 3 1
 */

class Pattern {

	public static void main(String[] args) {
	
		int n = 4;
		int[][] arr = new int[n][n];

		for(int i = 0; i < n; i++) {

			for(int k = 4; k >= i; k--) {
			
				System.out.print(" ");
			}
		
			for(int j = 0; j <= i; j++) {
			
				if(j == i || j == 0) {
				
					arr[i][j] = 1;
				} else {
				
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}

				System.out.printf(" %d", arr[i][j]);
			}

			System.out.println();
		}
	}
}
