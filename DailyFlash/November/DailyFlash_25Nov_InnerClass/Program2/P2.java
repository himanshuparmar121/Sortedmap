class X {

	class Y {
	
		static int a = 10;
		static final int b = 20;

		void printValues() {
		
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
	}

	public static void main(String[] args) {
	
		X objx = new X();
		Y objy = objx.new Y();
		objy.printValues();
	}
}

// There is error in this program because both the variables in Inner class are declared static and static doesn't work in inner class.
