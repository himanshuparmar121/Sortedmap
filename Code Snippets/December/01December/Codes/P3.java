class Demo {

	int a,b;
	Demo() {
	
		a = 10;
	}
}

class Core2web {

	public static void main(String[] args) {
	
		new Demo().a += 1;
		System.out.println(new Demo().a);
	}
}
