/* WAJP that contains a class Shape which has an overloaded method makeShape() and the parameters of the same should be:
 * -int: should print "Square is to be drawn with side: intValue"
 * -int, int: should print "Rectangle is to be drawn with length intValue1 and breath intValue2"
 * -float: should print "Circle is to be drawn with radius: floatValue"
 */

class Shape {

	void makeShape(int intValue) {
	
		System.out.println("Square is to be drawn with side: " + intValue);
	}

	void makeShape(int intValue1, int intValue2) {
	
		System.out.println("Rectangle is to be drawn with length: " + intValue1 + " and breath: " + intValue2);
	}
	void makeShape(float floatValue) {
	
		System.out.println("Circle is to be drawn with radius: " + floatValue);
	}

	public static void main(String[] args) {
	
		Shape obj = new Shape();

		obj.makeShape(5);
		obj.makeShape(4,6);
		obj.makeShape(3.5f);
	}
}
