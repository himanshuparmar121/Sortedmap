// We have a function in the base class and a function with the same name In a derived class, can the base class , function be called from the derived class object? Explain with example

class Base {

	void m1() {
	
		System.out.println("In m1-function in Base class");
	}
}

class Derived extends Base {

	void m1() {
	
		System.out.println("In m1-function in Derived class");
		super.m1();
	}

	public static void main(String[] args) {
	
		Base obj = new Derived();
		obj.m1();
	}
}

// No, we caannot call the base class function from derived class object, either we could pass the refernce as done above or we we can make the object of base class but 
// at runtime the derived class method overrides the base class method.
