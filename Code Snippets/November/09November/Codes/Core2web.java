public class Core2web {

	int var1 = 10;

	public static void main(String[] args) {
	
		Core2web c2w = new Core2web();
		System.out.println(++c2w.var1);
	}
}

class Main {

	public static void main(String[] args) {
	
		System.out.println("In Main");
		Core2web c2w = new Core2web();
		System.out.println(++c2w.var1);
	}
}
