class Demo {

	Demo(int a) {
	
		System.out.println("In int Constructor");
	}

	Demo(Integer a) {
	
		System.out.println("In Integer Constructor");
	}
}

class Core2web {

	public static void main(String[] args) {
	
		Demo d = new Demo(100);
	}
}
