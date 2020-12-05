class Core2web {

	int a = 10;

	public static void main(String[] args) {
	
		new Core2web().method1();
	}

	void method1() {
	
		int a = 20;
		System.out.println(this.a);
	}
}

// when we  use this we refer the class variable
