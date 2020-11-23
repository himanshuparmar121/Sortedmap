class IPL {

	private String name = "KL Rahul";
	private int runs = 579;

	IPL() {
	
		System.out.println("No - args Constructor");
	}

	IPL(String name, int runs) {
	
		this.name = name;
		this.runs = runs;
	}

	void display() {
	
		System.out.println("Name = " + name);
		System.out.println("Runs = " + runs);
	}
}

class Player {

	public static void main(String[] args) {
	
		IPL obj = new IPL();
		obj.display();

		IPL obj2 = new IPL("Mayank", 550);
		obj2.display();
	}
}
