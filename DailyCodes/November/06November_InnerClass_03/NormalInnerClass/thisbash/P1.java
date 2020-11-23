class Outer {

	class Inner {
	
		// final Outer this$0;

		void m1() {
		
			System.out.println("In Inner");
		}
	}

	public static void main(String[] args) {
	
		Outer o1 = new Outer();
		Outer o2 = new Outer();
		Inner i = o2.new Inner();
		i.m1();
	}
}
