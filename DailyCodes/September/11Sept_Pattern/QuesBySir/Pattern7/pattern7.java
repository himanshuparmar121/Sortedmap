class patternDemo {

	public static void main(String[] args) {
	
		char ch = 'A';

		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < 4; j++) {
			
				if(j >= i) {

					System.out.print(" " + ch);
					ch++;
				}
			}

			System.out.println();
		}
	}
}
