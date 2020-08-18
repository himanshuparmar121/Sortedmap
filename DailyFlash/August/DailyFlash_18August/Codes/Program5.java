// Q5. Write a maximum between three numbers.

class Program {

	public static void main(String[] args) {
	
		int num1 = 10, num2 = 20, num3 = 30;

		if(num1 > num2 && num1 > num3)
			System.out.println(num1 + " is maximum between " + num1 + ", " + num2 + " and " + num3);
		else if(num2 > num1 && num2 > num3)
			System.out.println(num2 + " is maximum between " + num1 + ", " + num2 + " and " + num3);
		else
			System.out.println(num3 + " is maximum between " + num1 + ", " + num2 + " and " + num3);
	}
}
