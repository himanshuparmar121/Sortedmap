// WAJP with a parameterised Constructor and assign the class variables in the constructor.

class Program {

	static int a = 10;
	char ch = 'B';

	Program() {
	
		System.out.println("In default Constructor");
		System.out.println("Int = " + a);
		System.out.println("Char = " + ch);
	}
	
	Program(int x, char z) {
	
		System.out.println("In parameterised Constructor");

		a = x;
		ch = z;

		System.out.println("Int = " + a);
		System.out.println("Char = " + ch);
	}

	public static void main(String args[]) {
	
		Program P1 = new Program();
		Program P2 = new Program(20,'A');
	}
}
