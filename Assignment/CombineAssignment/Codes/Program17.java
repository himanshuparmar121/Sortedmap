class PrimeNum {

	public static void main(String[] args) {
	
		int num = 13;
		int flag = 0;

		for(int i = 2; i <= num / 2; i++) {
		
			if(num % i == 0)
				flag = 1;
		}

		if(flag == 0)
			System.out.println("It is a prime number.");
		else
			System.out.println("It is not a prime number.");
	}
}
