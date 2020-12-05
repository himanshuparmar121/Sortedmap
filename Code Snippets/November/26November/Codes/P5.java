class Core2web {

	Core2web() {
	
		this("c2w");
		System.out.println("Core2web");;
	}

	Core2web(String str) {
	
		System.out.println(str);
	}

	public static void main(String[] args) {
	
		this("CAFEBABE");
	}
}

// this() can only be used in constructor and as a first statement to invoke other constructors.
