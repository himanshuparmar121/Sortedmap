class Pattern {

	public static void main(String[] args) {
	
		for(int i = 1; i < 5; i++) {
		
			for(int k = 3; k >= i; k--) {
			
				System.out.print("   ");
			}

			for(int j = 1; j <= i*2 - 1; j++) {
			
				if(i % 2 == 0)
					System.out.print(" = ");
				else
					System.out.print(" * ");
			}

			System.out.println();
		}
	}
}