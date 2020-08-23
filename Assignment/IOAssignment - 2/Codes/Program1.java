import java.io.*;

class Arithmetic {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Two numbers: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		
		System.out.print("Enter the choice:");
		int ch = Integer.parseInt(br.readLine());

		switch(ch) {
		
			case 1:
				System.out.println("Addition: " + (n1+n2));
				break;

			case 2:
				System.out.println("Subtraction: " + (n1-n2));
				break;

			case 3:
				System.out.println("Division: " + (n1/n2));
				break;

			case 4:
				System.out.println("Multiplication: " + (n1*n2));
				break;
		}
	}
}
