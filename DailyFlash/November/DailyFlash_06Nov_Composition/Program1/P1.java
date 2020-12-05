// WAP to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be equal to the string value passed while creating
// object of Student class. Note: don't use conditional statements.

class Student {

	String name;

	Student(String name) {
	
		this.name = name;
		System.out.println(name);
	}

	public static void main(String[] args) {
	
		new Student("Himanshu");
		new Student("Sai");
		new Student("Vishal");
		new Student("Sidharth");
	}
}
