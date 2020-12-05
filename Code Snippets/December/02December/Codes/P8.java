class Core2web {

	Core2web() {
	
		System.out.println("Zero Argument Constructor");
	}
	
	Core2web(int var1) {
	
		System.out.println("One Argument Constructor");
	}

	Core2web(int var1, int var2) {
		
		this();
		this(var1);
		System.out.println("Two Argument Constructor");
	}

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web(10,20);
	}
}
