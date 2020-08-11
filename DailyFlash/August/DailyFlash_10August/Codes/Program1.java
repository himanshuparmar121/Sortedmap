// Q1. Write a java program to print cubes of odd numbers 1 to 50.


class Program {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 50; i++) {
		
			int n = i * i * i;
			System.out.println("Cube of " + i + ": " + n);
		}
	}
}
