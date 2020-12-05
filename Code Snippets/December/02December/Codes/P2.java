class Core2web {

	int var1;

	Core2web(int var1) {
	
		this.var1 = var1;
	}

	Core2web(int var1, int var2, int var3) {
	
		var1 = var1;
		System.out.println(var1 + " ");
		var1 = var2;
		System.out.println(var1 + " ");
		var2 = var3;
		System.out.println(var1 + " ");

		Core2web(var1);
	}

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web(100,200,300);

		System.out.println(c2w.var1);
	}
}
