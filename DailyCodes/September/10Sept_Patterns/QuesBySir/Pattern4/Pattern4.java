class PatternDemo {

	public static void main(String[] args) {
	
		for(int i =0; i < 4; i++) {
		
			int n = 1;

			for(int j = 0; j < 4; j++) {
			
				if(i >= j) {

					System.out.print(" " + n);
					n++;
				}
			}

			System.out.println();
		}
	}
}
