import java.io.*;

class ArrayDemo {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter no. of planes: ");
		int planes = Integer.parseInt(br.readLine());
		
		System.out.print("Enter no. of rows: ");
		int rows = Integer.parseInt(br.readLine());
		
		System.out.print("Enter no. of columns: ");
		int cols = Integer.parseInt(br.readLine());

		int marr[][][] = new int[planes][rows][cols];

		System.out.println("Enter Elements:");
		for(int i = 0; i < planes; i++) {
		
			for(int j = 0; j < rows; j++) {
			
				for(int k = 0; k < cols; k++) {
				
					marr[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}

		System.out.println("1st plane: ");
		for(int i = 0; i < planes; i++) {
		
			if(i == 1) 
				System.out.println("2nd plane:");
			for(int j = 0; j < rows; j++) {
			
				for(int k = 0; k < cols; k++) {
				
					System.out.print(" " + marr[i][j][k]);
				}

				System.out.println();
			}
		}
	}
}
