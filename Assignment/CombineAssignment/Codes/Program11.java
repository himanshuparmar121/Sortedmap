class Divisor {

	public static void main(String[] args) {
	
		int num = 24;

		System.out.print("Perfect Divisors of " + num + " are : ");

		for(int i = 2; i <= num / 2; i++) {
		
			if(num % i == 0)
				System.out.print(i + " ");
		}
		
		System.out.println();
	}
}
