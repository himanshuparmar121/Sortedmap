class Core2web {

	Core2web() {
	
		System.out.println("Normal Constructor");
	}
	
	Core2web(float var1) {
	
		System.out.println("Parameterised Constructor");
	}

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web(10);
	}
}
