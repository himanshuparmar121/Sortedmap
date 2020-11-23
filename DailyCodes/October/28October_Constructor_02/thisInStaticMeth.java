class IPL {

	private String pName = "KL Rahul";
	private int runs = 579;

	IPL() {
	
		System.out.println("In no - args Constructor");
		System.out.println(this.runs);
	}

	IPL(String pName, int runs) {
	
		System.out.println("In Parameterised Constructor");
		this.pName = pName;
		this.runs = runs;
	}

	void display() {
	
		System.out.println("Name = " + this.pName);
		System.out.println("Runs = " + this.runs);
	}

	static void info() {
	
		System.out.println("Name = " + new IPL().pName);
		System.out.println("Runs = " + new IPL().runs);
	}
}

class BCCI {

	public static void main(String[] args) {
	
		IPL obj = new IPL();
		IPL obj2 = new IPL("Mayank", 550);
	}
}
