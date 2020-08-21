import java.io.*;

class Order {

	public static void main(String[] args) throws IOException {
	
		int max = 0;
		int mid = 0;
		int min = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

		if((num1 > num2 && num1 > num3) && (num3 < num1 && num3 < num2)) {
			
			max = num1;
			mid = num2;
			min = num3;
		} else if((num1 > num2 && num1 > num3) && (num2 < num1 && num2 < num3)) {
			
			max = num1;
			mid = num3;
			min = num2;
		} else if((num2 > num1 && num2 > num3) && (num3 < num1 && num3 < num2)) {
			
			max = num2;
			mid = num1;
			min = num3;
		} else if((num2 > num1 && num2 > num3) && (num1 < num2 && num1 < num3)) {
			
			max = num2;
			mid = num3;
			min = num1;
		} else if((num3 > num2 && num3 > num1) && (num1 < num2 && num1 < num3)) {
			
			max = num3;
			mid = num2;
			min = num1;
		} else {
			
			max = num3;
			mid = num1;
			min = num2;
		}

		System.out.println("Ascending Order: " + min + " " + mid + " " + max + " ");
		System.out.println("Descending Order: " + max + " " + mid + " " + min + " ");
	}
}
