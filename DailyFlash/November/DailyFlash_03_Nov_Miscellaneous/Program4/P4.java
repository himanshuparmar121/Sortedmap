// Take 2 constructor having following prototypes 
// -- void <your-class-name> (int side) prints area of square
// -- void <your-class-name> (int Len, int breath) print area of rectangle
// Create 2 seperate objects inside main

class Demo {

	Demo(int side) {
	
		System.out.println("Area of Square = " + (side*side));
	}

	Demo(int len, int breath) {
	
		System.out.println("Area of Rectangle = " + (len*breath));
	}

	public static void main(String[] args) {
	
		Demo obj = new Demo(5);
		Demo obj1 = new Demo(5, 10);
	}
}
