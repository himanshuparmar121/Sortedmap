class BCCI {

	String presName = "Ganguly";
	int years = 2;

	BCCI() {
	
		System.out.println("In BCCI Constructor");
	}
}

class IPL extends BCCI {

	IPL() {
	
		System.out.println("In IPL Constructor");
	}

	IPL(BCCI obj) {
	
		System.out.println("In parameterised Constructor");
		System.out.println("President = " + obj.presName);
		System.out.println("Years = " + obj.years);
	}
}

class IPL2020 {

	public static void main(String... args) {
	
		BCCI b = new BCCI();
		IPL obj1 = new IPL(b);
	}
}
