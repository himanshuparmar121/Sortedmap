class COre2web {

	public Core2web() {
	
		System.out.println("In Public Constructor");
	}
	
	private Core2web() {
	
		System.out.println("In Private Constructor");
	}
}

class Demo {

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web();
		c2w.Core2web();
	}
}
