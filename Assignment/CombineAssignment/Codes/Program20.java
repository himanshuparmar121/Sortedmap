class Pattern {

	public static void main(String[] args) {
	
		char ch1 = 'A', ch2 = 'a';

		for(int row = 1; row <= 4; row++) {
		
			for(int col = 1; col <= 4; col++) {
			
				if(row % 2 == 0) {
				
					System.out.print(ch2 + " ");
					ch2++;
				} else {
				
					System.out.print(ch1 + " ");
					ch1++;
				}
			}

			System.out.println();
		}
	}
}
