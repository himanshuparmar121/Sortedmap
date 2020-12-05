class Core2web {

	Core2web() {
	
		System.out.println("Default Constructor");
	}

	Core2web(int var1) {
	
		this();
		System.out.println("One Argument Constructor" + var1);
	}

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web(10);
	}
}
