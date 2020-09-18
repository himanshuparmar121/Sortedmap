class Pattern {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 4; i++) {
		
			int n = 1;

			for(int k = 3; k >= i; k--) {
			
				System.out.print("  ");
			}

			for(int j = 1; j <= i * 2 - 1; j++) {
			
				if(j >= i) {
					
					System.out.print(" " + n);
					n--;
				} else {
				
					System.out.print(" " + n);
					n++;
				}
			}

			System.out.println();
		}
	}
}
