class Core2web {

	int a;
}

class Test {

	public static void main(String[] args) {
	
		Core2web obj = new Core2web();
		Core2web obj2 = obj;
		System.out.println(obj2.a);
	}
}
