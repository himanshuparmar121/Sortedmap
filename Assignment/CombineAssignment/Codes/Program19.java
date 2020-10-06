class Pattern {

	public static void main(String[] args) {
	
		char ch = 'A';

		for(int row = 1; row <= 4; row++) {
		
			for(int col = 1; col <= 4; col++) {
			
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
