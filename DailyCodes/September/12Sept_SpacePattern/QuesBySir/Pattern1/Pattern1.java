class PatternDemo {

	public static void main(String[] args) {
	

		for(int i = 0; i < 4; i++) {
		
			for(int k = 3; k >= i; k--) {
			
				System.out.print("  ");
			}

			int num = 1;
			for(int j = 0; j <= i; j++) {
			
				System.out.print(" " + num);
				num++;
			}

			System.out.println();
		}
	}
}
