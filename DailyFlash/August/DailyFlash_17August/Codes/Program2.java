// Q2. Write a program to check the number is negative, positive or equal to zero.

class Program {

	public static void main(String[] args) {
	
		int num = -2;

		if(num == 0)
			System.out.println(num + " is equal to zero.");
		else if(num < 0)
			System.out.println(num + " is negative number");
		else
			System.out.println(num + " is positive number.");
	}
}
