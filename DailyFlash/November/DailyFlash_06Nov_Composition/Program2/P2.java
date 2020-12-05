// A person has a job, now implement the composition with this and print role, salary and id of the person
// (the composition is a restricted form of association in which two entities are highly dependent on each other.)

class Person {

	int id;
	String name;
	String role;
	long salary;

	Person(int id, String name, String role, long salary) {
	
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	void display() {
	
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Role: " + role);
		System.out.println("Employee Salary: " + salary);
	}
}

class Company {

	String name = "PTC";
	int totEmp = 100;

	Person detail1 = new Person(101, "Vishal", "Graphic Designer", 50000);
	Person detail2 = new Person(102, "Sai", "Developer", 90000);
	Person detail3 = new Person(103, "Himanshu", "CTO", 100000);

	void cmpDetail() {
	
		System.out.println("Company Name: " + name);
		System.out.println("Total Employees: " + totEmp);
		detail1.display();
		detail2.display();
		detail3.display();
	}

	public static void main(String[] args) {
	
		Company detail = new Company();
		detail.cmpDetail();
	}
}
