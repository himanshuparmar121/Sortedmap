class Pattern {

	public static void main(String[] args) {
	
		int n = 1;
		char c = 'A';

		for(int i = 1; i <= 4; i++) {
		
			for(int k = 3; k >= i; k--) {
			
				System.out.print("  ");
			}

			for(int j = 1; j <= i*2-1; j++) {
			
				if(i % 2 == 1) 
					System.out.print(" " + n);
				else
					System.out.print(" " + c);
			}

			c++;
			n++;
			System.out.println();
		}
	}
}
