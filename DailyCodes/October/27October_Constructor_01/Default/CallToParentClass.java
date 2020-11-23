class BCCI extends Object {

	BCCI() {
	
		System.out.println("BCCI Constructor");
	}
}

class IPL extends BCCI {

	IPL() {
	
		System.out.println("IPL COnstructor");
	}
}

class Match {

	public static void main(String[] args) {
	
		BCCI obj = new BCCI();
		IPL ipl = new IPL();
	}
}
