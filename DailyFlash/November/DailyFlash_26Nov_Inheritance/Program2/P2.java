// WAJC to print variable from parent class name Library and child class name Book in method info() present in Book class.

class Library {

	String bookName = "Core Java - I";
}

class Book extends Library {

	void info() {
	
		System.out.println("Book Name = " + this.bookName);
	}
}

class Person {

	public static void main(String[] args) {
	
		Book obj = new Book();
		obj.info();
	}
}
