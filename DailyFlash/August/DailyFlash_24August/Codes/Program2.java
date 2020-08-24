// Q2. Write a Program to print Sum of First 10 Natural Numbers.

class Sum {

	public static void main(String[] args) {
	
		int sum = 0;

		for(int num = 1; num <= 10; num++) {
		
			sum = sum + num;
		}

		System.out.println("Sum of First 10 Natural Numbers: " + sum);
	} 
}
