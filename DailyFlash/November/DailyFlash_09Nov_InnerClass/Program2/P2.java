// Write a program to print the names of students by creating a Student class. Pass the name of student in constructor and if no name is passed while creating an object of Student of Student class, 
// then the name should be "Unknown".

class Student {

	String name;

	Student() {
	
		System.out.println("Unknown");
	}

	Student(String name) {
	
		this.name = name;
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
	
		new Student("Himanshu");
		new Student("Sai");
		new Student("Sidhu");
		new Student("Vishal");
		new Student();
	}
}
