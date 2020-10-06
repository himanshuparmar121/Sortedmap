class SecondLarg {

	public static void main(String[] args) {
	
		int a = 23334, b = 1010, c = 10000;

		if((a < b && a > c) || (a > b && a < c))
			System.out.println("Second largest number is " + a);
		else if((b < a && b > c) || (b > a && b < c))
			System.out.println("Second largest number is " + b);
		else
			System.out.println("Second largest number is " + c);
	}
}
