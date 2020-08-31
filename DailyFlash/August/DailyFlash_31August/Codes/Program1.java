// Q1. Write a Program to print all the numbers ranging between 1 to 100 that are divisible bu 3 or 5.

class Divisible {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 100; i++) {
		
			if(i % 3 == 0 || i % 5 == 0)
				System.out.print(" " + i);
		}

		System.out.println();
	}
}
