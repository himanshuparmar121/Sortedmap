// WAJP with a single parameterised COnstructor and call a non static method from it.

class Program {

	int a = 10;

	void display() {
	
		System.out.println("Display Function");
	}

	Program(int b) {
	
		display();
		a = b;
		System.out.println("In Parameterised Constructor");
	}

	public static void main(String[] args) {
	
		Program P1 = new Program(20);
		P1.display();
	}
}
