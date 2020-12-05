//WAJP to demonstrate constructor overloading. Take a class StudentData and create tw objects of it. One is with default constructor and another one using parameterized constructor.
//Both the constructor have different initialization code.

class StudentData {

	String name;
	int roll;

	StudentData() {
	
		System.out.println("Student Details: ");
	}

	StudentData(String name, int roll) {
	
		this.name = name;
		this.roll = roll;
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
	}

	public static void main(String[] args) {
	
		new StudentData();
		new StudentData("Himanshu", 7);
	}
}
