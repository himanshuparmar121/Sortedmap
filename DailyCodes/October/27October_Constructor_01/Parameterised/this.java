class Company {

	String name = "Rahul";
	int age = 28;

	Company() {
	
		System.out.println("In - default Constructor");
	}

	Company(String name, int age) {
	
		this.name = name;
		this.age = age;
	}

	void display() {
	
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}

class Emp {

	public static void main(String[] args) {
	
		Company rahul = new Company();
		rahul.display();

		Company kanha = new Company("Kanha", 29);
		kanha.display();
	}
}
