//Is it possible to overload the main method(Explain with example)


class Overloading {

	void main(int x) {
	
		System.out.println("Overloaded method");
	}

	public static void main(String[] args) {
	
		System.out.println("Without overloading");
		
		Overloading obj = new Overloading();
		obj.main(12);
	}
}

// Yes, we can overload the main method but the JVM starts execution of program "public static void main(String[] args)" so, overloading the main doesn't work out.
