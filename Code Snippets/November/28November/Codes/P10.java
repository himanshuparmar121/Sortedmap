class Core2web {

	int var1 = 10;

	Core2web(int var1) {
	
		var1 = var1;
	}

	int getVar() {
	
		return var1;
	}

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web(100);
		System.out.println(c2w.getVar());
	}
}
