// Write a technical example  of Single level inheritance.

class CentralGov {
	
	CentralGov() {
	
		System.out.println("Central Government");
	}

	void rules() {
	
		System.out.println("Rules should be followed by every citizen");
	}
}

class StateGov extends CentralGov {
	
	StateGov() {
	
		System.out.println("State Government");
	}

	void rules() {
	
		System.out.println("Rules should be followed by every citizen");
	}
}

class Citizen {

	public static void main(String[] args) {
	
		CentralGov obj1 = new CentralGov();
		obj1.rules();

		StateGov obj2 = new StateGov();
		obj2.rules();
		
		CentralGov obj3 = new StateGov();
		obj3.rules();
	}
}
