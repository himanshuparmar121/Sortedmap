class Company {

	String CompName = "BMC Softwares";
	private String name = "Rahul";
	private int age = 29;

	Company() {
	
		System.out.println("Non - arg. Constructor");
	}

	Company(String empName, int empAge) {
	
		name = empName;
		age = empAge;
	}

	void display() {
	
		System.out.println("Company Name = " + CompName);
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}

class Employee {

	public static void main(String[] args) {
	
		Company rahul = new Company();
		rahul.display();

		Company kanha = new Company("Kanha", 28);
		kanha.display();
	}
}
