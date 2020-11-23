// Accessing static methods in Inner class

class Outer {

	int x = 10;
	static int y = 20;

	void outerM1() {
	
		System.out.println("In Outer M1");
	}

	static void outerM2() {
	
		System.out.println("In Outer M2");
	}

	class Inner {
	
		void InnerM1() {
		
			System.out.println(x);
			System.out.println(y);
			outerM1();
			outerM2();
		}
	}

	public static void main(String[] args) {
	
		new Outer().new Inner().InnerM1();
	}
}
