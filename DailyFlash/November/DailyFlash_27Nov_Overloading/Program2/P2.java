// WAP to overload method having parameters object of the user-defined class (real-time examole expected)

class Biencaps {

	Biencaps() {
	
		System.out.println("Biencaps Systems");
	}
}

class Core2web {

	Core2web() {
	
		System.out.println("Core2web Technologies");
	}
}

class ShashiBagal {

	void role(Biencaps cmp) {
	
		System.out.println("Shashi Bagal is CEO and co-founder of Biencaps");
	}
	
	void role(Core2web c2w) {
	
		System.out.println("Shashi Bagal is a teacher in Core2web");
	}
	
	public static void main(String[] args) {
	
		ShashiBagal work = new ShashiBagal();
		work.role(new Biencaps());
		work.role(new Core2web());
	}
}
