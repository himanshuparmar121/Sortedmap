class ArrayDemo {

	public static void main(String... args) {
	
		int marr[][][] = {{{1,2,3}, {4,5,6}, {7,8,9}}, {{1,1,1}, {2,2,2}, {3,3,3}}};

		System.out.println("1st Plane: ");
		for(int i = 0; i < 2; i++) {
		
			if(i == 1)
				System.out.println("2nd Plane: ");

			for(int j = 0; j < 3; j++) {
			
				for(int k = 0; k < 3; k++) {
				
					System.out.print(" " + marr[i][j][k]);
				}

				System.out.println();
			}
		}
	}
}
