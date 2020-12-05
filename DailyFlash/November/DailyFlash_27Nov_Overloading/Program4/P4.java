// WAP to overload method In which one of the methods should have varg parameters (refer examole taught in lecture overloading part-2)

class Demo {

	void m1(int x, int y) {
	
		System.out.println("Addition = " + (x+y));
	}

	void m1(int ... vargs) {
	
		System.out.println("Addition = " + (vargs[0] + vargs[1] + vargs[2] + vargs[3]));
	}
	
	public static void main(String[] args) {
	
		Demo  d1 = new Demo();
		d1.m1(10, 20);
		d1.m1(10, 20, 30, 10);
	}
}
