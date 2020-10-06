/* Take 2D int array input(n*n) and print transpose of it.
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Output:
 * 1 4 7
 * 2 5 8
 * 3 6 9
 */
import java.io.*;

class Program {

	static void transpose(int A[][], int B[][], int N) {
	
		int i, j;
		for(i = 0; i < N; i++) {
		
			for(j = 0; j < N; j++) {
			
				B[i][j] = A[j][i];
			}
		}
	}
	public static void main(String[] args) throws IOException {
	
		int i, j, N;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		int A[][] = new int[N][N];
		int B[][] = new int[N][N];
		
		for(i = 0; i < N; i++) {
		
			for(j = 0; j < N; j++) {
			
				A[i][j] = Integer.parseInt(br.readLine());
			}
		}

		transpose(A, B, N);

		System.out.println("Transpose Of Matrix:");
		for(i = 0; i < N; i++) {
		
			for(j = 0; j < N; j++) {
			
				System.out.print(B[i][j] + " ");
			}

			System.out.println();
		}
	}
}
