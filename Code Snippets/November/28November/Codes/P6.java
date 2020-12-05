class Core2web {

	static int var = 10;

	Core2web(int var) {
	
		this.var = var;
	}

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web(100);
		System.out.println("var = " + var);
		System.out.println("var = " + c2w.var);
	}
}
