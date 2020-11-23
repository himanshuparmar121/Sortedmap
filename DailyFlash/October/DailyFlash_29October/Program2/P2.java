/* Write a class MarutiSuzuki having method engine. Create two more seperate classes named Maruti and Suzuki overriding the method engine. 
 * Display the content in the engine method using main method. *Note: You are allowed to write anything in the method engine.
 */

class MarutiSuzuki {

	void engine() {
	
		System.out.println("In MarutiSuzuki");
		System.out.println("Old and Classic Diesel engine");
	}
}

class Maruti {

	void engine() {
	
		System.out.println("In Maruti");
		System.out.println("Newly designed and Classic Diesel engine");
	}
}

class Suzuki {

	void engine() {
	
		System.out.println("In Suzuki");
		System.out.println("Designed by Hightec Engineers ");
	}
}

class Main {

	public static void main(String[] args) {
	
		MarutiSuzuki e1 = new MarutiSuzuki();
		e1.engine();
		
		Maruti e2 = new Maruti();
		e2.engine();
		
		Suzuki e3 = new Suzuki();
		e3.engine();
	}
}
