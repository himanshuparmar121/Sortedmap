/* Write an abstract class Car with abstract methods mileage and price, and a concrete method seater which displays four seater. You are free to override the seater method if you want to.
 * Extend this abstract class and give body to its methods and display them using main method.
 */

abstract class Car {

	abstract void mileage();
	abstract void price();

	void seater() {
	
		System.out.println("Seater");
	}
}

class Hyundai extends Car{

	Hyundai() {
	
		System.out.println("Car: Venue");
	}

	void mileage() {
	
		System.out.println("Mileage: 15 - 18 kmpl");
	}

	void price() {
	
		System.out.println("Price: 10L - 14L (Based on diff. variants)");
	}

	void seater() {
	
		System.out.println("5 Seater");
	}

	public static void main(String[] args) {
	
		Hyundai Venue = new Hyundai();
		Venue.mileage();
		Venue.price();
		Venue.seater();
	}
}
