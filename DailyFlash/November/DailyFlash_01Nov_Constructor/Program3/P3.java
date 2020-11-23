// WAJP containing all the possible types along access specifiers.

class Program {

	String str = "Core2web";

	public Program() {
	
		System.out.println("In Default Constructor");
	}

	private Program(String s) {
	
		System.out.println("In Parameterised Constructor");

		str = s;

		System.out.println("String = " + s);
	}

	public static void main(String[] args) {
	
		Program P1 = new Program();
		Program P2 = new Program("Biencaps");
	}
}
