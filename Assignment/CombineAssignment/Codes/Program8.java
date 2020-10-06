class PrimeNum {

	public static void main(String[] args) {
	
		int num = 141;
		int flag;

		System.out.println("Enter a number : " + num);
		System.out.print("The prime digit from the number " + num + " is ");

		for(; num != 0;) {
		
			int rem = 0;
			rem = num % 10;
			flag = 0;
			
			for(int i = 2; i <= rem / 2; i++) {
			
				if(rem % i == 0)
					flag = 1;
			}

			if(flag == 0)
				System.out.print(rem + ", ");	

			num = num / 10;
		}

		System.out.println();
	}
}
