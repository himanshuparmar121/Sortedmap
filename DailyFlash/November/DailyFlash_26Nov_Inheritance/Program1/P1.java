// Write a real - time example for Hierarchical inheritance on Indian Festivals.(Atleast 3 classes)

class Festival {

	Festival() {
	
		System.out.println("Year 2020");
	}
}

class Holi extends Festival {

	Holi() {
	
		System.out.println("Holi is in March");
	}

	void Holi() {
	
		System.out.println("Joy Of Colors\n");
	}
}

class Rakshabandhan extends Festival {

	Rakshabandhan() {
	
		System.out.println("Rakshabandhan is in August");
	}
	
	void Rakhi() {
	
		System.out.println("Love of Sister and Brother\n");
	}
}

class Diwali extends Festival {

	Diwali() {
	
		System.out.println("Diwali is in November");
	}

	void Diwali() {
	
		System.out.println("Celebration and Laxmi-Pujan\n");
	}
}

class Year2020 {

	public static void main(String[] args) {
	
		Holi obj1 = new Holi();
		obj1.Holi();

		Rakshabandhan obj2 = new Rakshabandhan();
		obj2.Rakhi();

		Diwali obj3 = new Diwali();
		obj3.Diwali();
	}
}
