class PatternDemo {

	public static void main(String[] args) {
	
		int n = 1;
		char c = 'A';

		for(int i = 1; i < 5; i++) {
		
			for(int j = 4; j >= i; j--) {
				
					if(j == 4 || j == 2) {
					
						System.out.print(" " + n);
						n++;
					} else {
					
						System.out.print(" " + c);
						c++;
						n++;
					}
			}

			System.out.println();
		}
	}
}
