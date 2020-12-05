class Core2web {

	int var1 = 10;

	Core2web() {
	
		System.out.println("Default Argument");
	}
	
	Core2web(int var1) {

		this(10);
		System.out.println("Parameterised Constructor");
	}

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web(10);
	}
}
