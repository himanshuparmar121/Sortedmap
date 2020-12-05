/* WAP having a class Calculator in which write a method for the addition of two numbers and overload the same method to add three numbers
 * add(10,20)
 * O/p: Addition of two numbers is 30
 * add(10,20, 30)
 * O/p: Addition of three numbers is 60
 */

class Calculator {

	void add(int x,int y) {
	
		System.out.println("Addition of two numbers: " + (x+y));
	}
	
	void add(int x,int y, int z) {
	
		System.out.println("Addition of three numbers: " + (x+y+z));
	}

	public static void main(String[] args) {
	
		Calculator c1 = new Calculator();
		c1.add(10,20);
		c1.add(10,20,30);
	}
}
