import java.io.*;

class Divisible {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a Number: ");
		int num = Integer.parseInt(br.readLine());

		if(num % 5 == 0 && num % 10 == 0)
			System.out.println(num + " is divisible by both 5 and 10");
		else
			System.out.println(num + " is not divisible by both 5 and 10");
	}
}
