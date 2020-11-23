class CompEngg {

	default String name = "Rahul";
	default int age = 29;

	CompEngg() {
	
		System.out.println("In Constructor");
	}

	void display() {
	
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}

class Student {

	public static void main(String[] args) {
	
		CompEngg rahul = new CompEngg();
		rahul.display();

		CompEngg kanha = new CompEngg();
		kanha.name = "Kanha";
		kanha.age = 27;
		kanha.display();
	}
}
