// Accessing Inner class from another class

class Outer {

	int x = 10;

	class Inner {
	
		void xyz() {
		
			System.out.println("In Inner class Method");
		}
	}
}

class InnerDemo {

	public static void main(String[] args) {
	
		Outer o = new Outer();
		System.out.println(o.x);

		Outer.Inner i = o.new Inner();
		i.xyz();
	}
}
