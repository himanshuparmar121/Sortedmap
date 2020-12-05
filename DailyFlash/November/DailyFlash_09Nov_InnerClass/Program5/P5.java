/* 		1
 *  	      1   0
 *  	    1   0   1
 *  	  1   0   1  0
 *  	1   0  1   0  1
 */


class Pattern {

	public static void main(String[] args) {
	
		for(int i = 0; i < 5; i++) {
		
			for(int j = 5; j > i; j--) {
			
				System.out.print(" ");
			}

			for(int k = 0; k <= i; k++) {
			
				if(k%2 == 0)
					System.out.print("1  ");
				else
					System.out.print("0  ");
			}

			System.out.println();
		}
	}
}
