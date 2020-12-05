class Core2web {

	Core2web() {
	
		System.out.println("In default...");
	}

	Core2web(int a) {
	
		this();
		System.out.println("In parametrised");
	}

	public static void main(String[] args) {
	
		new Core2web(10);
	}
}
