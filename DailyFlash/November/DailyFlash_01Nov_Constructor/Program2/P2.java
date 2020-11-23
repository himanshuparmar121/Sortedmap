// Write a java Program and print all the variables in the constructor

class Program {

	int a = 10;
	char b = 'a';
	float c = 10.5f;

	Program() {
	
		System.out.println("Int = " + a);
		System.out.println("Char = " + b);
		System.out.println("Float = " + c);
	}

	public static void main(String[] args) {
	
		Program P1 = new Program();
	}
}
