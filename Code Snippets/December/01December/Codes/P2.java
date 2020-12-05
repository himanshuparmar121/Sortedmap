class Demo {

	int a,b;
	Demo() {
	
		a = 10;
	}
}

class Core2web {

	public static void main(String[] args) {
	
		Demo obj = new Demo();
		obj.a += 1;
		System.out.println(obj.a);
	}
}
