class PatternDemo {

	public static void main(String[] args) {
	
		int n= 1;
		char c = 'A';

		for(int i = 0; i < 4; i++) {
		
			for(int j = 3; j >= i; j--) {
			
				if(i == 0 || i == 2) {
				
					System.out.print(" " + n);
					n++;
				} else {
				
					System.out.print(" " + c);
					c++;
				}
			}

			System.out.println();
		}
	}
}
