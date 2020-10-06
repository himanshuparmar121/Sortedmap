/* WAJP that acceots 2D array of rows and columns from the user. Print 2D Array, Print a hour glass Structure for eg:
 * 1 2 3 4 
 * 5 6 7 8
 * 9 10 11 12
 *
 * hour glass Structure is:
 * 1 2 3
 *  6
 * 9 10 11
 *
 * 2 3 4
 *  7
 * 10 11 12
 */
import java.io.*;

class Program {

	static void hourGlass(int[][] mat, int N) {
	
		int i, j;
		for(i = 0; i < N-2; i++) {
		
			for(j = 0; j < N-2; j++) {

				System.out.println(" " + mat[i][j] + " " + mat[i][j+1] + " " + mat[i][j+2] + "\n  " + mat[i+1][j+1] + "\n" + mat[i+2][j] + " " + mat[i+2][j+1] + " " + mat[i+2][j+2] + "\n");
			}
		}
	}

	static void main(String[] args) {
	
		int i, j, N;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		int A[][] = new int[N][N];
		int B[][] = new int[N][N];

		for(i = 0; i < N; i++) {
		
			for(j = 0; j < N; j++) {
			
				A[i][j] = Integer.parseInt(br.readLine());
			}

			hourGlass(mat, N);
		}
	}
}
