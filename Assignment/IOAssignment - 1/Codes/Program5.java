import java.io.*;

class PrimeNumbers {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int count = 0;
	
		while(num1 <= num2) {
		
			int flag = 0;

			if(num1 == 0)
				num1++;
			if(num1 == 1)
				num1++;

			for(int i = 2; i <= num1 / 2; i++) {
			
				if(num1 % i == 0)
					flag = 1;
			}

			if(flag == 0) {
				System.out.print(num1 +" ");
				count++;
			}


			num1++;
		}

		System.out.println();
		
		if(count == 0) {
			System.out.println("The count is: " + count);
			System.out.println("No Prime numbers to display.");
		} else
			System.out.println("The count is: " + count);
	}
}
