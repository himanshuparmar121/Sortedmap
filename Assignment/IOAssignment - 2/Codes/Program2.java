import java.io.*;

class Divisors {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter a Number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= num/2; i++) {
		
			if(num % i == 0)
				System.out.print(i + " ");
		}

		System.out.println();
	}
}
