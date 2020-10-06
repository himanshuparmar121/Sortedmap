
import java.io.*;

class Arithmetic {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two Numbers: ");
		int a = Integer.parseInt(br.readLine());
		
		String x = br.readLine();
		int b = Integer.parseInt(x);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
	}
}
