class MinimumNum {

	public static void main(String[] args) {
	
		int num1 = 50;
		int num2 = 7;
		int num3 = 56;

		if(num1 > num2 && num3 > num2)
			System.out.println("Minimum number from " + num1 + ", " + num2 + " and " + num3 + " is " + num2);
		else if(num2 > num1 && num3 > num1)
			System.out.println("Minimum number from " + num1 + ", " + num2 + " and " + num3 + " is " + num1);
		else	
			System.out.println("Minimum number from " + num1 + ", " + num2 + " and " + num3 + " is " + num3);
	}
}
