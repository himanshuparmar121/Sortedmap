class Jagged3D {

	public static void main(String[] args) {
	
		int[2][][] arr = {
	
			int[3][] {
		
				new int[] {1,2},
				new int[] {3,4,5},
				new int[] {6,7,8,9}
			},
			int[3][] {
		
				new int[] {1,2},
				new int[] {3,4,5},
				new int[] {6,7,8,9}
			}
		};

		for(int i = 0; i < 2; i++) {

			if(i == 1)
				System.out.println("2nd array:");

			for(int j = 0; j < 3; j++) {
			
				for(int k = 0; k < 3; k++) {
				
					System.out.print(xarr[i][j][k] + " ");
				}

				System.out.println();
			}
		}
	}
}
