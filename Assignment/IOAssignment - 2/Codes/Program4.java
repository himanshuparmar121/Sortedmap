import java.io.*;

class CubeSqrs {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Range1 : ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("Range2 : ");
		int num2 = Integer.parseInt(br.readLine());

		int dup1 = num1, dup2 = num2;
		System.out.print("Square: ");

		while(dup1 <= dup2) {
		
			System.out.print((dup1*dup1) + " ");
			dup1++;
		}

		System.out.println();

		System.out.print("Cube: ");

		while(num1 <= num2) {
		
			System.out.print((num1*num1*num1) + " ");
			num1++;
		}

		System.out.println();
	}
}
