class Core2web {

	static {
	
		Core2web c2w = new Core2web();
	}

	String str = Core2web.fun();

	static String fun() {
	
		System.out.println("FUN");
		return "fun";
	}

	public static void main(String[] args) {
	
		System.out.println("Main");
	}

	Core2web() {
	
		System.out.println("Constructor");
	}
}

// Anything that is not in any method or Constructor or static block is considered to be in an Instance Initializer biock(IIB), IIB is executed before creation of any instance(object).
// Hence, before creating an object in static block the fun method is executed followed by constructor and then main method.

