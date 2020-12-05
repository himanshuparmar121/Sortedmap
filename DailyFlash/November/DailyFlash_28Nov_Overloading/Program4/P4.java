// WAJP with class Demo that has overloaded method m1() with parameters:
// -int
// -float
// Make the call to the method using m1('A');
// Explain the Output using comments.

class Demo {

	void m1(int a) {
	
		System.out.println(a);
	}
	
	void m1(float a) {
	
		System.out.println(a);
	}

	public static void main(String[] args) {
	
		Demo d = new Demo();
		d.m1('A');
		d.m1('A');
	}
}
