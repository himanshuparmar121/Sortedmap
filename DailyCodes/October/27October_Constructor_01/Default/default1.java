class IPL {

	String name = "Virat Kholi";
	int runs = 200;

	IPL() {
	
		System.out.println("Player Name = " + name);
		System.out.println("Player Runs = " + runs);
	}
}

class Match {

	public static void main(String[] args) {
	
		IPL ipl2019 = new IPL();
		ipl2019.runs = 300;

		IPL ipl2020 = new IPL();
	}
}
