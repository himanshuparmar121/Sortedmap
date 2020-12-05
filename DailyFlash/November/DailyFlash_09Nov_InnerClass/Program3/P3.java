// Write a model class & create a instance variable to store model name. Pass the model name in constructor while creting car object. 
// Write one method getModelName() in car class & call that method in main class with the car object.

class Model {

	String model;
}

class Car extends Model {

	Car(String model) {
	
		this.model = model;
	}

	void getModelName() {
	
		System.out.println("Model Name: " + super.model);
	}

	public static void main(String[] args) {
	
		Car obj = new Car("Hyundai Venue");
		obj.getModelName();
	}
}
