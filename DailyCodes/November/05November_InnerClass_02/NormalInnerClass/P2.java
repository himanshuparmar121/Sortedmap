// Accessing method of Inner class from the method of Outer class

class Outer {

	int x = 10;

	class Inner {
	
		void xyz() {
		
			System.out.println("In the Inner class Method");
		}
	}

	void outerXyz() {
	
		System.out.println(x);
		Inner i = new Inner();
		i.xyz();
	}

	public static void main(String[] args) {
	
		new Outer().outerXyz();
	}
}
