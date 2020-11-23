// Write a java Program with a default Constructor and a non - static method and call from the constructor.

class Program {

	Program() {
	
		System.out.println("Default Constructor");
	}

	void display() {
	
		System.out.println("Display Function");
	}

	public static void main(String[] args) {
	
		Program P1 = new Program();
		P1.display();
	}
}
