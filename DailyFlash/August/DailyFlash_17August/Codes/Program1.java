// Q1. Write a program to find maximum between two numbers.

class Program {

	public static void main(String[] args) {
	
		int num = 12;
		int dup = num;
		int rem = 0, max = 0;

		while(num != 0) {
		
			rem = num % 10;

			if(rem > max) {
			
				max = rem;
			}

			num = num / 10;
		}

		System.out.println(max + " is maximum between " + dup);
	}
}
