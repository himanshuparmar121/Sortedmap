class Core2web {

	Core2web() {
	
		System.out.println("Zero Parameter Constructor");
	}

	Core2web(int var1) {
	
		System.out.println("One Parameter Constructor");
		this();
	}
	
	Core2web(int var1, int var2) {
	
		System.out.println("Two Parameter Constructor");
		this(var1+var2);
	}

	public static void main(String[] args) {
	
		COre2web c2w = new Core2web(10,20);
	}
}
