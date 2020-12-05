class Core2web {

	static {
	
		Core2web c2w = new Core2web();
	}

	Core2web obj = new Core2web();

	public static void main(String[] args) {
	
		System.out.println("Main");
	}

	Core2web() {
	
		System.out.println("Constructor");
	}
}

// Creation of object obj is considered to be in an initializer block, An initializer block is executed whenever an instance(object) is created.
