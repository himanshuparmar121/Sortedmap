class Core2web {

	int var = 10;

	Core2web(int var) {
	
		this.var = var;
	}
	
	Core2web(Core2web c2w) {
	
		this.var = var;
	}

	public static void main(String[] args) {
	
		Core2web c2w1 = new Core2web(100);
		Core2web c2w2 = new Core2web(c2w1);

		System.out.println(c2w1.var);
		System.out.println(c2w2.var);
	}
}

// Each object get their own copy of instance variable
