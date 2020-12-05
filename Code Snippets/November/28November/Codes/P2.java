class Demo {

	int var = 100;
	Demo(int var) {
	
		System.out.println("In Demo COnstructor");
	}
}

class Core2web {

	public static void main(String[] args) {
	
		Demo d = new Demo();
	}
}
