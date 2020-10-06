import java.util.*;

class Char2DArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int col = sc.nextInt();

		char[][] marr = new char[row][col];

		System.out.println("Enter elements: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				marr[i][j] = sc.next().charAt(0);
			}
		}
		
		System.out.println("Array is: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				System.out.print(" " + marr[i][j]);
			}

			System.out.println();
		}
	}
}
