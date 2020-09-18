class PatternDemo {

	public static void main(String[] args) {
	
		char c = 'A';

		for(int i = 0; i < 4; i++) {
		
			for(int k = 3; k >= i; k--) {
			
				System.out.print("  ");
			}

			for(int j = 0; j <= i; j++) {
			
				System.out.print(" " + c);
				c++;
			}

			System.out.println();
		}
	}
}
