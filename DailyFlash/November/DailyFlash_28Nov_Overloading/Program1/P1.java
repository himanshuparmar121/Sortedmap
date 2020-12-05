// WAJP with a class Demo and overload method functionCall(), with -int, -float, -char and -String as parameters.
// In the main function, call the same using respective values.

class Demo {

	void funCall(String name) {
	
		System.out.println("Name: " + name);
	}
	
	void funCall(char grade) {
	
		System.out.println("Grade: " + grade);
	}

	void funCall(int age) {
	
		System.out.println("Age: " + age);
	}

	void funCall(float marks) {
	
		System.out.println("Marks: " + marks);
	}
	
	public static void main(String[] args) {
	
		Demo obj = new Demo();
		obj.funCall("Himanshu");
		obj.funCall('B');
		obj.funCall(20);
		obj.funCall(77);
	}
}
