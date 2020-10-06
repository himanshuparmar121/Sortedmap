class NeonNum {

	public static void main(String[] args) {
	
		int num = 9;
		int sqr = num * num;
		int rem = 0, sum = 0;

		while(sqr != 0) {
		
			rem = sqr % 10;
			sum = sum + rem;
			sqr = sqr / 10;
		}

		if(sum == num)
			System.out.println(num + " is a neon number.");
		else	
			System.out.println(num + " is not a neon number.");
	}
}
