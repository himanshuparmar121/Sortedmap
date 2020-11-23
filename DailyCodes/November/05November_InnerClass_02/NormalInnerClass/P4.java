// Accessing Inner class from another class's method

class Outer {

	int x = 10;

	class Inner {
	
		void xyz() {
	
			System.out.println("In Inner class");	
		}
	}
}

class InnerDemo {

	void myMethod() {
	
		Outer o = new Outer();
		System.out.println(o.x);

		Outer.Inner i = o.new Inner();
		i.xyz();
	}

	public static void main(String[] args) {
	
		InnerDemo id = new InnerDemo();
		id.myMethod();
	}
}
