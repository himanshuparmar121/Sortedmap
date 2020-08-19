/* Q4. Pattern          
                1 2 3 4
                1 2 3 4
                1 2 3 4
                1 2 3 4
*/

class Program {

	public static void main(String[] args) {
	
		for(int row = 0; row < 4; row++) {
		
			int num = 1;

			for(int col = 0; col < 4; col++) {
			
				System.out.print(num + "  ");
				num++;
			}

			System.out.println();
		}
	}
}
